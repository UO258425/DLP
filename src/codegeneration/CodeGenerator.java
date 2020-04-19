package codegeneration;

import ast.type.Type;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class CodeGenerator {

    private PrintStream printStream = new PrintStream(System.out);

    public CodeGenerator(String outFileName) throws FileNotFoundException {
        this.printStream = new PrintStream(new FileOutputStream(outFileName));
    }

    public void push(String suffix, double value) {
        printStream.println("\tpush" + suffix + " " + value);
    }

    public void arithmetic(String operation, String suffix) {
        switch (operation) {
            case "+":
                printStream.println("\tadd" + suffix);
                break;
            case "-":
                printStream.println("\tsub" + suffix);
                break;
            case "*":
                printStream.println("\tmul" + suffix);
                break;
            case "/":
                printStream.println("\tdiv" + suffix);
                break;
            case "%":
                printStream.println("\tmod" + suffix);
                break;
            default:
                throw new IllegalStateException("That operation ("+operation+") is not supported for arithmetic");
        }
    }

    public void cast(String suffix1, String suffix2) {
        printStream.println("\t"+suffix1+"2"+suffix2);
    }

    public void load(String suffix) {
        printStream.println("\tload"+suffix);
    }

    public void logical(String operation, String suffix) {
        switch (operation) {
            case ">":
                printStream.println("\tgt" + suffix);
                break;
            case ">=":
                printStream.println("\tge" + suffix);
                break;
            case "<":
                printStream.println("\tlt" + suffix);
                break;
            case "<=":
                printStream.println("\tle" + suffix);
                break;
            case "!=":
                printStream.println("\tne" + suffix);
                break;
            case "==":
                printStream.println("\teq" + suffix);
                break;
            case "&&":
                printStream.println("\tand");
                break;
            case "||":
                printStream.println("\tor");
                break;
            default:
                throw new IllegalStateException("That operation ("+operation+")is not supported for logical operation");
        }
    }

    public void pusha(int offset) {
        printStream.println("\tpusha "+offset);
    }

    public void pushbp() {
        printStream.println("\tpush bp");
    }

    public void addi() {
        printStream.println("\taddi");
    }

    public void pushi(int offset) {
        printStream.println("\tpushi " + offset);
    }

    public void in(String suffix) {
        printStream.println("\tin"+suffix);
    }

    public void store(String suffix) {
        printStream.println("\tstore"+suffix);
    }

    public void out(String suffix) {
        printStream.println("\tout"+suffix);

    }

    public void commentVariable(Type type, String name, int offset) {
        printStream.println("\t' * "+ type + " " + name + " (offset "+ offset + ")");
    }
}
