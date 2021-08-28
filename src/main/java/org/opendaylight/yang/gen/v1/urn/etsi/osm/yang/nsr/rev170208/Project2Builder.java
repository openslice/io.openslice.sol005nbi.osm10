package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceConfig;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Project2Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     Project2Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new Project2BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of Project2Builder, as instances can be freely passed around without
 * worrying about synchronization issues.
 * 
 * <p>
 * As a side note: method chaining results in:
 * <ul>
 *   <li>very efficient Java bytecode, as the method invocation result, in this case the Builder reference, is
 *       on the stack, so further method invocations just need to fill method arguments for the next method
 *       invocation, which is terminated by {@link #build()}, which is then returned from the method</li>
 *   <li>better understanding by humans, as the scope of mutable state (the builder) is kept to a minimum and is
 *       very localized</li>
 *   <li>better optimization oportunities, as the object scope is minimized in terms of invocation (rather than
 *       method) stack, making <a href="https://en.wikipedia.org/wiki/Escape_analysis">escape analysis</a> a lot
 *       easier. Given enough compiler (JIT/AOT) prowess, the cost of th builder object can be completely
 *       eliminated</li>
 * </ul>
 * 
 * @see Project2Builder
 * @see Builder
 *
 */
public class Project2Builder implements Builder<Project2> {

    private NsInstanceConfig _nsInstanceConfig;



    public Project2Builder() {
    }

    public Project2Builder(Project2 base) {
        this._nsInstanceConfig = base.getNsInstanceConfig();
    }


    public NsInstanceConfig getNsInstanceConfig() {
        return _nsInstanceConfig;
    }

    
    public Project2Builder setNsInstanceConfig(final NsInstanceConfig value) {
        this._nsInstanceConfig = value;
        return this;
    }
    

    @Override
    public Project2 build() {
        return new Project2Impl(this);
    }

    private static final class Project2Impl
        implements Project2 {
    
        private final NsInstanceConfig _nsInstanceConfig;
    
        Project2Impl(Project2Builder base) {
            this._nsInstanceConfig = base.getNsInstanceConfig();
        }
    
        @Override
        public NsInstanceConfig getNsInstanceConfig() {
            return _nsInstanceConfig;
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_nsInstanceConfig);
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!Project2.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Project2 other = (Project2)obj;
            if (!Objects.equals(_nsInstanceConfig, other.getNsInstanceConfig())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Project2");
            CodeHelpers.appendValue(helper, "_nsInstanceConfig", _nsInstanceConfig);
            return helper.toString();
        }
    }
}
