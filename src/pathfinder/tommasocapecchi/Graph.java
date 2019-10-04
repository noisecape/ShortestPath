package pathfinder.tommasocapecchi;

import java.util.LinkedList;

public class Graph {
	
	private double[][] adiacency_matrix;
	private int number_of_columns;
	private int number_of_rows;
	
	Graph(int columns, int rows, LinkedList<Node> nodes){
		this.number_of_columns = columns;
		this.number_of_rows = rows;
		this.adiacency_matrix = create_adiacency_matrix(nodes);
	}
	
	private double[][] create_adiacency_matrix(LinkedList<Node> nodes) {
		adiacency_matrix = new double [this.number_of_rows][this.number_of_columns];
		for(Node node1: nodes) {
			for(Node node2: nodes) {
				if((node1.get_id().equals(node2.get_id()))){
					adiacency_matrix[node1.get_index()][node2.get_index()] = 0;
				}
				double euclidean_distance = compute_euclidean_distance(node1,node2);
				adiacency_matrix[node1.get_index()][node2.get_index()] = euclidean_distance;
			}
		}
		return adiacency_matrix;
	}
	
	private double compute_euclidean_distance(Node node_1, Node node_2) {
		return Math.sqrt(Math.pow(node_1.get_x()-node_2.get_x(), 2) + Math.pow(node_1.get_y()-node_2.get_y(), 2));
	}
	
	double[][] get_adiacency_matrix(){
		return this.adiacency_matrix;
	}
	
}
