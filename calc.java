package org.formulacompiler.gen;
import org.formulacompiler.examples.Inputs;
import org.formulacompiler.examples.Outputs;
import org.formulacompiler.runtime.Computation;
import org.formulacompiler.runtime.internal.Environment;

final class $Root implements Computation, Outputs
{
    private final Inputs $inputs;
    final Environment $environment;
    
    $Root(Inputs inputs, Environment environment) {
        $environment = environment;
        $inputs = inputs;
    }
    
    final double get$0() {
        return get$1() * get$2();
    }
    
    public final double getResult() {
        return get$0();
    }
    
    final double get$1() {
        return $inputs.getA();
    }
    
    final double get$2() {
        return $inputs.getB();
    }
}

