package hu.bme.mit.viatra.ttc.dse;

import java.io.IOException;
import java.util.Arrays;

import org.apache.log4j.Level;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer.DseLoggingLevel;
import org.eclipse.viatra.dse.util.EMFHelper;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

import hu.bme.mit.viatra.ttc.dse.benchmark.BenchmarkEntry;
import hu.bme.mit.viatra.ttc.dse.benchmark.BenchmarkResults;

/**
 * 
 * This class gives a command line for solving the TTC case with the pre-configured NSGA-II algorithm.
 */
public class DseSolverMain {

	public static void main(String[] args) throws IOException, ViatraQueryException {
		if (args.length < 1) {
			System.out.println("Usage: DseSolver number-of-runs [inputs]");
			System.out.println("Examples: ");
			System.out.println("- DseSolver 10");
			System.out.println("- DseSolver 5 A B");
			return;
		}

		final int runs = Integer.valueOf(args[0]);
		
		String[] inputs = Arrays.copyOfRange(args, 1, args.length);
		if (inputs.length < 1) {
			inputs = new String[] { "A", "B", "C", "D", "E" };
		}

		DesignSpaceExplorer.turnOnLoggingWithBasicConfig(DseLoggingLevel.WARN);

		final BenchmarkResults results = BenchmarkResults.create();
		
		for (String input : inputs) {
			for (int run = 0; run < runs; run++) {
			    System.out.println("Model: " + input + ", run: " + run);
				final String inputModelName = "TTC_InputRDG_" + input.toUpperCase();
				final BenchmarkEntry entry = results.createEntry(input);
				EObject initialModel = CraHelper.loadInitialModel(inputModelName);
				entry.startTimer();
				double craIndex = CraDseRunner.runDseWithInputModel(initialModel);
				entry.stopTimer();
				System.out.println(entry.getElapsedTime());
				entry.setCraIndex(craIndex);
				results.serializeLastEntry();
				EMFHelper.serializeModel(initialModel, "result_" + inputModelName + run, "xmi");
			}
		}
		
	}

}
