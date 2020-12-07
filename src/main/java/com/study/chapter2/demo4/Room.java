package com.study.chapter2.demo4;

/**
 * @author jianghui
 * @date 2020-12-01 10:41
 */
//public class Room implements AutoCloseable{
//    private static final Cleaner cleaner = Cleaner.create();
//    private static class State implements Runnable{
//        int numJunkPiles;
//        State(int numJunkPiles){
//            this.numJunkPiles = numJunkPiles;
//        }
//        @Override
//        public void run() {
//            System.out.println("Cleaning room");
//            numJunkPiles = 0;
//        }
//    }
//    private final State state;
//    private final Cleaner.Cleanable cleanalbe;
//
//    public Room(int numJunkPiles){
//        state = new State(numJunkPiles);
//        cleanalbe = cleaner.register(this,state);
//    }
//
//    @Override
//    public void close() throws Exception {
//        cleanalbe.clean();
//    }
//}
