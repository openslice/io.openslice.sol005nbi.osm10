package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSliceType;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link SNSSAIIdentifierBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     SNSSAIIdentifierBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new SNSSAIIdentifierBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of SNSSAIIdentifierBuilder, as instances can be freely passed around without
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
 * @see SNSSAIIdentifierBuilder
 * @see Builder
 *
 */
public class SNSSAIIdentifierBuilder implements Builder<SNSSAIIdentifier> {

    private String _sliceDifferentiator;
    private NetworkSliceType _sliceServiceType;


    Map<Class<? extends Augmentation<SNSSAIIdentifier>>, Augmentation<SNSSAIIdentifier>> augmentation = Collections.emptyMap();

    public SNSSAIIdentifierBuilder() {
    }
    public SNSSAIIdentifierBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai arg) {
        this._sliceServiceType = arg.getSliceServiceType();
        this._sliceDifferentiator = arg.getSliceDifferentiator();
    }

    public SNSSAIIdentifierBuilder(SNSSAIIdentifier base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<SNSSAIIdentifier>>, Augmentation<SNSSAIIdentifier>> aug =((AugmentationHolder<SNSSAIIdentifier>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._sliceDifferentiator = base.getSliceDifferentiator();
        this._sliceServiceType = base.getSliceServiceType();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai) {
            this._sliceServiceType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai)arg).getSliceServiceType();
            this._sliceDifferentiator = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai)arg).getSliceDifferentiator();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai]");
    }

    public String getSliceDifferentiator() {
        return _sliceDifferentiator;
    }
    
    public NetworkSliceType getSliceServiceType() {
        return _sliceServiceType;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<SNSSAIIdentifier>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public SNSSAIIdentifierBuilder setSliceDifferentiator(final String value) {
        this._sliceDifferentiator = value;
        return this;
    }
    
    public SNSSAIIdentifierBuilder setSliceServiceType(final NetworkSliceType value) {
        this._sliceServiceType = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public SNSSAIIdentifierBuilder addAugmentation(Augmentation<SNSSAIIdentifier> augmentation) {
        return doAddAugmentation(augmentation.implementedInterface(), augmentation);
    }
    
    /**
      * Add or remove an augmentation to this builder's product.
      *
      * @param augmentationType augmentation type to be added or removed
      * @param augmentationValue augmentation value, null if the augmentation type should be removed
      * @return this builder
      * @deprecated Use either {@link #addAugmentation(Augmentation)} or {@link #removeAugmentation(Class)} instead.
      */
    @Deprecated(forRemoval = true)
    public SNSSAIIdentifierBuilder addAugmentation(Class<? extends Augmentation<SNSSAIIdentifier>> augmentationType, Augmentation<SNSSAIIdentifier> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public SNSSAIIdentifierBuilder removeAugmentation(Class<? extends Augmentation<SNSSAIIdentifier>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private SNSSAIIdentifierBuilder doAddAugmentation(Class<? extends Augmentation<SNSSAIIdentifier>> augmentationType, Augmentation<SNSSAIIdentifier> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public SNSSAIIdentifier build() {
        return new SNSSAIIdentifierImpl(this);
    }

    private static final class SNSSAIIdentifierImpl
        extends AbstractAugmentable<SNSSAIIdentifier>
        implements SNSSAIIdentifier {
    
        private final String _sliceDifferentiator;
        private final NetworkSliceType _sliceServiceType;
    
        SNSSAIIdentifierImpl(SNSSAIIdentifierBuilder base) {
            super(base.augmentation);
            this._sliceDifferentiator = base.getSliceDifferentiator();
            this._sliceServiceType = base.getSliceServiceType();
        }
    
        @Override
        public String getSliceDifferentiator() {
            return _sliceDifferentiator;
        }
        
        @Override
        public NetworkSliceType getSliceServiceType() {
            return _sliceServiceType;
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
            result = prime * result + Objects.hashCode(_sliceDifferentiator);
            result = prime * result + Objects.hashCode(_sliceServiceType);
            result = prime * result + Objects.hashCode(augmentations());
        
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
            if (!SNSSAIIdentifier.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            SNSSAIIdentifier other = (SNSSAIIdentifier)obj;
            if (!Objects.equals(_sliceDifferentiator, other.getSliceDifferentiator())) {
                return false;
            }
            if (!Objects.equals(_sliceServiceType, other.getSliceServiceType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SNSSAIIdentifierImpl otherImpl = (SNSSAIIdentifierImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SNSSAIIdentifier>>, Augmentation<SNSSAIIdentifier>> e : augmentations().entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SNSSAIIdentifier");
            CodeHelpers.appendValue(helper, "_sliceDifferentiator", _sliceDifferentiator);
            CodeHelpers.appendValue(helper, "_sliceServiceType", _sliceServiceType);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
