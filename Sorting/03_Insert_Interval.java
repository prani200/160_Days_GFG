class Solution {
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) 
    {
        
        ArrayList<int[]> res = new ArrayList<>();
        int i =0;
        int n = intervals.length;
        
        //Add all intervals that come before 
        while(i<n && intervals[i][1] < newInterval[0])
        {
            res.add(intervals[i]);
            i++;
        }
        
        //Merge all Overlapping Intervals with new interval
        while(i<n && intervals[i][0] <= newInterval[1]) 
        {
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        
        res.add(newInterval);
        
        //add remaining elements
        while(i<n)
        {
            res.add(intervals[i]);
            i++;
        }
        
        
        
        return res;
        
        
        
        
        
        
        
        
        
    }
}
