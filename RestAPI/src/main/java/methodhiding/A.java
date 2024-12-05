package methodhiding;


public final class A {
    private int userId;
    private String name;

    public A(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    
}
