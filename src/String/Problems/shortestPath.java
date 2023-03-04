//java problem to find the shortest path
package String.Problems;

public class shortestPath {
    public static float getShortestPath(String path)
    {
        int x = 0 , y = 0;
        for(int i=0 ; i<path.length() ; i++)
        {
            char dir = path.charAt(i);
            if(dir=='N')
            {
                y++;
            }
            else if(dir=='E')
            {
                x++;
            }
            else if(dir=='S')
            {
                y--;
            }
            else
            {
                x--;
            }
        }

        int a = (int)Math.pow(x , 2);
        int b = (int)Math.pow(y , 2);
        return (float)Math.sqrt(a+b);
    }
    public static void main(String[] args)
    {
        String path = "WNEENESENNN";
        System.out.println("The shortest path is "+getShortestPath(path));
    }
}
