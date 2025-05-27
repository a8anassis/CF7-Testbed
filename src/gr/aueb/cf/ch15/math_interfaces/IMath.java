package gr.aueb.cf.ch15.math_interfaces;

public interface IMath {
    int add(int a, int b);
    int sub(int a, int b);
    int div(int a, int b) throws DivisionWithZeroException;
    int mod(int a, int b) throws ModWithZeroException;
}
