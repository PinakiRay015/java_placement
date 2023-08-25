package String;

public class SortestPath {
    public static int getDirection(String str)
    {
        int x = 0 ; int y=0;
        for(int i=0 ; i<str.length() ; i++)
        {
            char dir = str.charAt(i);
            if(dir == 'W')
            {
                x--;
            }
            else if(dir == 'N')
            {
                y++;
            }

            else if(dir == 'S')
            {
                y--;
            }

            else
            {
                x++;
            }
        }
        return (int)Math.sqrt(Math.pow(x , 2) + Math.pow(y , 2));
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getDirection(str));
    }
}
