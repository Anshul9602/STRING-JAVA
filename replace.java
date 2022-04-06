public class replace{
    public static void main(String[] args){
        String name = "anshul";
        System.out.println(name.replace("ans","hns"));
        // if condition  is true than return   true
        System.out.println(name.startsWith("ans"));
        System.out.println(name.contentEquals("ul"));

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("an"));
        System.out.println(name.indexOf("an",4));
        // if condition  is true than return   true other than false
        System.out.println(name.equals("anshu"));
        // if the element is upper and lower both case are present..
        System.out.println(name.equalsIgnoreCase("ANShul"));
    }
}
