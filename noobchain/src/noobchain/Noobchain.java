package noobchain;

public class Noobchain {

	public static void main(String[] args) {

		//https://medium.com/programmers-blockchain/create-simple-blockchain-java-tutorial-from-scratch-6eeed3cb03fa

		Block genesisBlock = new Block("Hi im the first block", "0");

		System.out.println("Hash for block 1 : " + genesisBlock.hash);

		

		Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);

		System.out.println("Hash for block 2 : " + secondBlock.hash);

		

		Block thirdBlock = new Block("Hey im the third block",secondBlock.hash);

		System.out.println("Hash for block 3 : " + thirdBlock.hash);

	}
	
}
