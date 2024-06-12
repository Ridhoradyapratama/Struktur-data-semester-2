package tugasGraph;
import java.util.*;

public class DFSIterative {
	    private Map<String, List<String>> graph = new HashMap<>();

	    public void addEdge(String node, List<String> neighbors) {
	        graph.put(node, neighbors);
	    }

	    public void dfs(String start) {
	        Set<String> visited = new HashSet<>();
	        Stack<String> stack = new Stack<>();
	        stack.push(start);

	        while (!stack.isEmpty()) {
	            String vertex = stack.pop();
	            if (!visited.contains(vertex)) {
	                System.out.print(vertex + " ");
	                visited.add(vertex);
	                for (String neighbor : graph.get(vertex)) {
	                    if (!visited.contains(neighbor)) {
	                        stack.push(neighbor);
	                    }
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        DFSIterative dfs = new DFSIterative();
	        dfs.addEdge("G", Arrays.asList("H", "I"));
	        dfs.addEdge("H", Arrays.asList("J", "K"));
	        dfs.addEdge("I", Arrays.asList("L"));
	        dfs.addEdge("J", new ArrayList<>());
	        dfs.addEdge("K", Arrays.asList("L"));
	        dfs.addEdge("L", new ArrayList<>());

	        System.out.println("\nDFS Traversal (Iterative):");
	        dfs.dfs("G");
	    }
	}
