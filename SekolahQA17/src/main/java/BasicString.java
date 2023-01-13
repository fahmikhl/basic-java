public class BasicString {
    public static void main(String[] args) {
        String str = "Sekolah QA 17";

        int method1 = str.length(); // 13
        char charAtIndex = str.charAt(0); // index start dari 0
        String lowerCaseStr = str.toLowerCase(); // sekolah qa 17
        String upperCaseStr = str.toUpperCase(); // SEKOLAH QA 17
        String subStringStr = str.substring(5); //
        String subStringStrInTheMiddle = str.substring(2, 7); //index ke-5 tidak termasuk

        System.out.println(method1);
        System.out.println(charAtIndex);
        System.out.println(lowerCaseStr);
        System.out.println(upperCaseStr);
        System.out.println(subStringStr);
        System.out.println(subStringStrInTheMiddle);

        //concatenation
        String firstName = "John ";
        String lastName = "Doe";

        String fullName = firstName.concat(lastName);

        System.out.println(fullName);

    }
}
