// Last updated: 10/9/2026, 9:34:25 AM
import java.util.*;

public class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int initialOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                initialOnes++;
            }
        }
        
        String t = "1" + s + "1";
        
        List<Integer> blocks = new ArrayList<>();
        int currentLen = 1;
        for (int i = 1; i < t.length(); i++) {
            if (t.charAt(i) == t.charAt(i - 1)) {
                currentLen++;
            } else {
                blocks.add(currentLen); 
                currentLen = 1;
            }
        }
        blocks.add(currentLen);
        
        if (blocks.size() < 5) {
            return initialOnes;
        }
        
        int nBlocks = blocks.size();
        int maxOnes = initialOnes;
        
        List<ZeroBlock> zeroBlocks = new ArrayList<>();
        for (int i = 1; i < nBlocks; i += 2) {
            zeroBlocks.add(new ZeroBlock(blocks.get(i), i));
        }
        
        zeroBlocks.sort((a, b) -> Integer.compare(b.length, a.length));
        
        for (int i = 2; i < nBlocks - 2; i += 2) {
            int oneLen = blocks.get(i);
            int zLeftIdx = i - 1;
            int zRightIdx = i + 1; 
            
            int gainA = blocks.get(zLeftIdx) + blocks.get(zRightIdx);
            maxOnes = Math.max(maxOnes, initialOnes + gainA);
            
            for (ZeroBlock zBlock : zeroBlocks) {
                if (zBlock.index != zLeftIdx && zBlock.index != zRightIdx) {
                    int gainB = zBlock.length - oneLen;
                    maxOnes = Math.max(maxOnes, initialOnes + gainB);
                    break; 
                }
            }
        }
        
        return maxOnes;
    }
    
    private static class ZeroBlock {
        int length;
        int index;
        
        ZeroBlock(int length, int index) {
            this.length = length;
            this.index = index;
        }
    }
}
