package de.tomsit.bugs.lombok.util_class;

import lombok.Builder;
import lombok.experimental.UtilityClass;

@Builder(toBuilder = true)
public record OuterClass(
        String foo

) {

    @UtilityClass
    public
//    static
    class InnerClass {

        public static final String BAR = "bar";
    }

}
