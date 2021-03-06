/**
 * 
 */
package com.tvd12.ezyfox.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author tavandung12
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE })
public @interface AutoResponse {

    public String[] events() default {};
    
}
