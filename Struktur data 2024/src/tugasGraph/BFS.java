package tugasGraph;
import java.util.*;
public class BFS {
    
    private Map<String, List<String>> graph = new HashMap<>();

    public void addEdge(String node, List<String> neighbors) {
        graph.put(node, neighbors);
    }

    public void bfs(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            System.out.print(vertex + " ");

            for (String neighbor : graph.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.addEdge("G", Arrays.asList("H", "I"));
        bfs.addEdge("H", Arrays.asList("J", "K"));
        bfs.addEdge("I", Arrays.asList("L"));
        bfs.addEdge("J", new ArrayList<>());
        bfs.addEdge("K", Arrays.asList("L"));
        bfs.addEdge("L", new ArrayList<>());

        System.out.println("BFS Traversal:");
        bfs.bfs("G");
    }
}

	
	    