package test;

import java.util.concurrent.RecursiveTask;

/// ParMaxSearcher Class
/// Fork - Join pool exercise 6
/// Student Name: Ahigad Genish
/// ID : 31628022

public class ParMaxSearcher extends RecursiveTask<Integer> {

	// Data Members
	private static final long serialVersionUID = 1L;
	private final BinTree binaryTree;

	// Constructor
	public ParMaxSearcher(BinTree newBinaryTree){
		this.binaryTree = newBinaryTree;
	}


	@Override
	protected Integer compute() {

		// If tree / subtree is empty
		if (this.binaryTree == null) {
			return Integer.MIN_VALUE;
		}

		// Create ParMaxSearcher node of left subtree
		ParMaxSearcher maxLeft = new ParMaxSearcher(this.binaryTree.getLeft());
		maxLeft.fork(); // Create new thread by Fork-Join pool to compute it their

		// Create ParMaxSearcher node of right subtree
		ParMaxSearcher maxRight = new ParMaxSearcher(this.binaryTree.getRight());

		// Return maximum between current value and the computed value of the left subtree by join and right subtree by compute
		return Math.max(this.binaryTree.v, Math.max(maxLeft.join(), maxRight.compute()));
	}
}
