package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.VnffgdCatalog;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Project1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     Project1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new Project1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of Project1Builder, as instances can be freely passed around without
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
 * @see Project1Builder
 * @see Builder
 *
 */
public class Project1Builder implements Builder<Project1> {

    private VnffgdCatalog _vnffgdCatalog;



    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._vnffgdCatalog = base.getVnffgdCatalog();
    }


    public VnffgdCatalog getVnffgdCatalog() {
        return _vnffgdCatalog;
    }

    
    public Project1Builder setVnffgdCatalog(final VnffgdCatalog value) {
        this._vnffgdCatalog = value;
        return this;
    }
    

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl
        implements Project1 {
    
        private final VnffgdCatalog _vnffgdCatalog;
    
        Project1Impl(Project1Builder base) {
            this._vnffgdCatalog = base.getVnffgdCatalog();
        }
    
        @Override
        public VnffgdCatalog getVnffgdCatalog() {
            return _vnffgdCatalog;
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
            result = prime * result + Objects.hashCode(_vnffgdCatalog);
        
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
            if (!Project1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Project1 other = (Project1)obj;
            if (!Objects.equals(_vnffgdCatalog, other.getVnffgdCatalog())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Project1");
            CodeHelpers.appendValue(helper, "_vnffgdCatalog", _vnffgdCatalog);
            return helper.toString();
        }
    }
}
