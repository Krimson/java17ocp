package lab.bjes.locale;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class LocaleLab {
    public LocaleLab() {
        desc();
        differentValues();
    }

    private void desc() {
        System.out.println("--- Locale - Language specific resource bundles");
        System.out.println("It's possible to have multiple resource files depending on country & language");
        System.out.println("The files need to have the same base name, and then separated by _lang_country");
        System.out.println("ExampleResource, ExampleResource_en, ExampleResource_en_US etc");
    }

    private void differentValues() {
        System.out.println("--- Locale - Get language/country specific property values");

        System.out.println("Instantiate Resource bundle from bundle props.properties: ResourceBundle rb = ResourceBundle.getBundle(\"props\");");
        ResourceBundle rb = ResourceBundle.getBundle("props");
        System.out.println("rb.getBaseBundleName(): " + rb.getBaseBundleName());

        System.out.println("Get locale for resource bundle, rb.getLocale(): " + rb.getLocale());
        System.out.println("Request value for key appDescription, rb.getObject(\"appDescription\"): " + rb.getObject("appDescription"));

        System.out.println("We can open the resource bundle for the Norwegian properties using: rb = ResourceBundle.getBundle(\"props\", new Locale(\"no\", \"NO\")");
        rb = ResourceBundle.getBundle("props", new Locale("no", "NO"));

        System.out.println("rb.getLocale(): " + rb.getLocale());
        System.out.println("rb.getObject(\"appDescription\"): " + rb.getObject("appDescription"));

        try {
            System.out.println("Trying to get value for property that doesn't exist: rb.getObject(\"yolo\")");
            System.out.println(rb.getObject("yolo"));
        }
        catch (MissingResourceException mre) {
            System.out.println("MissingResourceException caught...");
        }
    }
}
