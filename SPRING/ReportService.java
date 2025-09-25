/*
 * Printer Example
Create an interface Printer with a method print(String message).

Implement two classes: ConsolePrinter and FilePrinter.

Use dependency injection so that a ReportService can use either printer without changing its code.

 */
interface Printer {
    void print(String message);
}

class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Console Printer: " + message);
    }
}

class FilePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("File Printer: " + message);
    }
}

class dependencyConcept {

    private Printer printer;

    public dependencyConcept(Printer printer) {
        this.printer = printer;
    }

    void startprint(String message) {
        printer.print(message);
    }
}

public class ReportService {
    public static void main(String[] args) {
        dependencyConcept report1 = new dependencyConcept(new ConsolePrinter());
        report1.startprint("This is a console report.");

        dependencyConcept report2 = new dependencyConcept(new FilePrinter());
        report2.startprint("This is a file report.");
    }
}