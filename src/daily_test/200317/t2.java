import java.util.Stack;

public class t2 {
    public String simplifyPath(String path) {
        String[] arr=path.split("/");
        Stack<String> stack=new Stack();

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if(!arr[i].equals("") && !arr[i].equals(".") && !arr[i].equals("..")){
                stack.add(arr[i]);
            }
        }

        if(stack.isEmpty())return "/";
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            res.append("/" + stack.get(i));
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        String s="/home/";
        System.out.println(new t2().simplifyPath(s));
    }
}
