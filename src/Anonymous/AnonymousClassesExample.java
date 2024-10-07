package Anonymous;
interface Greeting{
    void greet();
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void greet() {
                System.out.println("interface greet method ");
            }
        };
        g.greet();
    }
}
