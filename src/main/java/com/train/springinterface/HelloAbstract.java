package com.train.springinterface;

public abstract class HelloAbstract implements Hello {
    private Random random;

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public abstract Random createRandom();
} 