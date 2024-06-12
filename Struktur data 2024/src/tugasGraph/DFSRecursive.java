package tugasGraph;
import java.util.*;

public class DFSRecursive {
	    private Map<String, List<String>> graph = new HashMap<>();

	    public void addEdge(String node, List<String> neighbors) {
	        graph.put(node, neighbors);
	    }

	    public void dfs(String vertex, Set<String> visited) {
	        if (!visited.contains(vertex)) {
	            visited.add(vertex);
	            System.out.print(vertex + " ");
	            for (String neighbor : graph.get(vertex)) {
	                dfs(neighbor, visited);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        DFSRecursive dfs = new DFSRecursive();
	        dfs.addEdge("G", Arrays.asList("H", "I"));
	        dfs.addEdge("H", Arrays.asList("J", "K"));
	        dfs.addEdge("I", Arrays.asList("L"));
	        dfs.addEdge("J", new ArrayList<>());
	        dfs.addEdge("K", Arrays.asList("L"));
	        dfs.addEdge("L", new ArrayList<>());

	        System.out.println("\nDFS Traversal (Recursive):");
	        dfs.dfs("G", new HashSet<>());
	    }
	}
