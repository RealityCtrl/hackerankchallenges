package com.hrchallenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class SocksTest {

    private Socks testSocks = new Socks();

    @Test
    public void testSockMerchantThreePairs(){
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int pairs = testSocks.sockMerchant(socks.length, socks);
        assertEquals(3, pairs);
    }

    @Test
    public void testSockMerchantOneSock(){
        int[] socks = {10};
        int pairs = testSocks.sockMerchant(socks.length, socks);
        assertEquals(0, pairs);
    }

    @Test
    public void testSockMerchantThreePairsEven(){
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10};
        int pairs = testSocks.sockMerchant(socks.length, socks);
        assertEquals(3, pairs);
    }

    @Test
    public void testSockMerchantTwoPairsEven2(){
        int[] socks = {10, 10, 20, 10, 10, 30, 50, 10};
        int pairs = testSocks.sockMerchant(socks.length, socks);
        assertEquals(2, pairs);
    }

    @Test
    public void testSockMerchantEmpty(){
        int[] socks = {};
        int pairs = testSocks.sockMerchant(socks.length, socks);
        assertEquals(0, pairs);
    }

    @Test
    public void testSockMerchantFourPairsEven(){
        int[] socks = {10, 10, 10, 10, 10, 10, 10, 10};
        int pairs = testSocks.sockMerchant(socks.length, socks);
        assertEquals(4, pairs);
    }

    @Test
    public void testSockMerchantFourPairsOdd(){
        int[] socks = {10, 10, 10, 10, 10, 10, 10, 10, 10};
        int pairs = testSocks.sockMerchant(socks.length, socks);
        assertEquals(4, pairs);
    }

    @Test
    public void testSockMerchantThreePairsMethod2(){
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int pairs = testSocks.sockMerchant2(socks.length, socks);
        assertEquals(3, pairs);
    }

    @Test
    public void testSockMerchantOneSockMethod2(){
        int[] socks = {10};
        int pairs = testSocks.sockMerchant2(socks.length, socks);
        assertEquals(0, pairs);
    }

    @Test
    public void testSockMerchantThreePairsEvenMethod2(){
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10};
        int pairs = testSocks.sockMerchant2(socks.length, socks);
        assertEquals(3, pairs);
    }

    @Test
    public void testSockMerchantTwoPairsEven2Method2(){
        int[] socks = {10, 10, 20, 10, 10, 30, 50, 10};
        int pairs = testSocks.sockMerchant2(socks.length, socks);
        assertEquals(2, pairs);
    }

    @Test
    public void testSockMerchantEmptyMethod2(){
        int[] socks = {};
        int pairs = testSocks.sockMerchant2(socks.length, socks);
        assertEquals(0, pairs);
    }

    @Test
    public void testSockMerchantFourPairsEvenMethod2(){
        int[] socks = {10, 10, 10, 10, 10, 10, 10, 10};
        int pairs = testSocks.sockMerchant2(socks.length, socks);
        assertEquals(4, pairs);
    }

    @Test
    public void testSockMerchantFourPairsOddMethod2(){
        int[] socks = {10, 10, 10, 10, 10, 10, 10, 10, 10};
        int pairs = testSocks.sockMerchant2(socks.length, socks);
        assertEquals(4, pairs);
    }

    @Test
    public void testSockMerchantThreePairsMethod3(){
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int pairs = testSocks.sockMerchant2(socks.length, socks);
        assertEquals(3, pairs);
    }

    @Test
    public void testSockMerchantOneSockMethod3(){
        int[] socks = {10};
        int pairs = testSocks.sockMerchant3(socks.length, socks);
        assertEquals(0, pairs);
    }

    @Test
    public void testSockMerchantThreePairsEvenMethod3(){
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10};
        int pairs = testSocks.sockMerchant3(socks.length, socks);
        assertEquals(3, pairs);
    }

    @Test
    public void testSockMerchantTwoPairsEven2Method3(){
        int[] socks = {10, 10, 20, 10, 10, 30, 50, 10};
        int pairs = testSocks.sockMerchant3(socks.length, socks);
        assertEquals(2, pairs);
    }

    @Test
    public void testSockMerchantEmptyMethod3(){
        int[] socks = {};
        int pairs = testSocks.sockMerchant3(socks.length, socks);
        assertEquals(0, pairs);
    }

    @Test
    public void testSockMerchantFourPairsEvenMethod3(){
        int[] socks = {10, 10, 10, 10, 10, 10, 10, 10};
        int pairs = testSocks.sockMerchant3(socks.length, socks);
        assertEquals(4, pairs);
    }

    @Test
    public void testSockMerchantFourPairsOddMethod3(){
        int[] socks = {10, 10, 10, 10, 10, 10, 10, 10, 10};
        int pairs = testSocks.sockMerchant3(socks.length, socks);
        assertEquals(4, pairs);
    }
}
