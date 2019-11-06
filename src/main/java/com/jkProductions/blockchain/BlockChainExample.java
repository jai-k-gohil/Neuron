package com.jkProductions.blockchain;

import java.util.Arrays;

public class BlockChainExample {
    public static void main(String[] args) {
        /**
         * This class is for demonstration of block chain
         * where block = hash(previous block) + transaction or data associated with that block
         * In this case hashcode of the block is its digital signature
         */

        //Creating some sample transactions for demonstration
        Transaction transaction1 = new Transaction("Jay","John",100L);
        Transaction transaction2 = new Transaction("Ryan","Smith",200L);
        Transaction transaction3 = new Transaction("Ryan","Smith",200L);
        Transaction transaction4 = new Transaction("Ryan","Jay",150L);

        //Genesis block is the first initial block of the blockchain
        Block genesisBlock = new Block(0,Arrays.asList(transaction1,transaction2));
        System.out.println("Genesis Block signature :"+genesisBlock.hashCode());
        Block secondBlock = new Block(genesisBlock.hashCode(),Arrays.asList(transaction3));
        System.out.println("Second Block signature :" + secondBlock.hashCode());
        Block thirdBlock = new Block(secondBlock.hashCode(),Arrays.asList(transaction4));
        System.out.println("Third Block signature :" + thirdBlock.hashCode());
    }
}
