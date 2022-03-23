package lambda.one;

import java.util.Date;

@FunctionalInterface
public interface DateFactory {
    public Date create();
}
