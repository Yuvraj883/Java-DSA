class StringBufferClass {
    public static void main(String ar[]) {
        StringBuffer s1 = new StringBuffer();
        System.out.println(" S1 Capacity :" + s1.capacity());
        StringBuffer s2 = new StringBuffer(10);
        System.out.println(" S2 Capacity :" + s2.capacity());

        StringBuffer s3 = new StringBuffer("JAVA");
        System.out.println(" S3 Capacity :" + s3.capacity());
        StringBuffer st = new StringBuffer("\nComputer");
        st.append("Dept");
        System.out.println(st);
        st.reverse();
        System.out.println("reverse :" + st);
        StringBuffer sn = new StringBuffer("ComputerDept");
        sn.insert(8, "Engg");
        System.out.println("insert : " + sn);
        sn.replace(2, 5, "AAAA");
        System.out.println("replace : " + sn);
    }
}
