package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.NsParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.NsParameterGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.NsParameterGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.NsParameterKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.VnfPrimitiveGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.VnfPrimitiveGroupKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link GetNsConfigPrimitiveValuesOutputBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     GetNsConfigPrimitiveValuesOutputBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new GetNsConfigPrimitiveValuesOutputBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of GetNsConfigPrimitiveValuesOutputBuilder, as instances can be freely passed around without
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
 * @see GetNsConfigPrimitiveValuesOutputBuilder
 * @see Builder
 *
 */
public class GetNsConfigPrimitiveValuesOutputBuilder implements Builder<GetNsConfigPrimitiveValuesOutput> {

    private Map<NsParameterKey, NsParameter> _nsParameter;
    private Map<NsParameterGroupKey, NsParameterGroup> _nsParameterGroup;
    private Map<VnfPrimitiveGroupKey, VnfPrimitiveGroup> _vnfPrimitiveGroup;


    Map<Class<? extends Augmentation<GetNsConfigPrimitiveValuesOutput>>, Augmentation<GetNsConfigPrimitiveValuesOutput>> augmentation = Collections.emptyMap();

    public GetNsConfigPrimitiveValuesOutputBuilder() {
    }

    public GetNsConfigPrimitiveValuesOutputBuilder(GetNsConfigPrimitiveValuesOutput base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<GetNsConfigPrimitiveValuesOutput>>, Augmentation<GetNsConfigPrimitiveValuesOutput>> aug =((AugmentationHolder<GetNsConfigPrimitiveValuesOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._nsParameter = base.getNsParameter();
        this._nsParameterGroup = base.getNsParameterGroup();
        this._vnfPrimitiveGroup = base.getVnfPrimitiveGroup();
    }


    public Map<NsParameterKey, NsParameter> getNsParameter() {
        return _nsParameter;
    }
    
    public Map<NsParameterGroupKey, NsParameterGroup> getNsParameterGroup() {
        return _nsParameterGroup;
    }
    
    public Map<VnfPrimitiveGroupKey, VnfPrimitiveGroup> getVnfPrimitiveGroup() {
        return _vnfPrimitiveGroup;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<GetNsConfigPrimitiveValuesOutput>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public GetNsConfigPrimitiveValuesOutputBuilder setNsParameter(final Map<NsParameterKey, NsParameter> values) {
        this._nsParameter = values;
        return this;
    }
    
    /**
      * Utility migration setter.
      *
      * <b>IMPORTANT NOTE</b>: This method does not completely match previous mechanics, as the list is processed as
      *                        during this method's execution. Any future modifications of the list are <b>NOT</b>
      *                        reflected in this builder nor its products.
      *
      * @param values Legacy List of values
      * @return this builder
      * @throws IllegalArgumentException if the list contains entries with the same key
      * @throws NullPointerException if the list contains a null entry
      * @deprecated Use {#link #setNsParameter(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public GetNsConfigPrimitiveValuesOutputBuilder setNsParameter(final List<NsParameter> values) {
        return setNsParameter(CodeHelpers.compatMap(values));
    }
    public GetNsConfigPrimitiveValuesOutputBuilder setNsParameterGroup(final Map<NsParameterGroupKey, NsParameterGroup> values) {
        this._nsParameterGroup = values;
        return this;
    }
    
    /**
      * Utility migration setter.
      *
      * <b>IMPORTANT NOTE</b>: This method does not completely match previous mechanics, as the list is processed as
      *                        during this method's execution. Any future modifications of the list are <b>NOT</b>
      *                        reflected in this builder nor its products.
      *
      * @param values Legacy List of values
      * @return this builder
      * @throws IllegalArgumentException if the list contains entries with the same key
      * @throws NullPointerException if the list contains a null entry
      * @deprecated Use {#link #setNsParameterGroup(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public GetNsConfigPrimitiveValuesOutputBuilder setNsParameterGroup(final List<NsParameterGroup> values) {
        return setNsParameterGroup(CodeHelpers.compatMap(values));
    }
    public GetNsConfigPrimitiveValuesOutputBuilder setVnfPrimitiveGroup(final Map<VnfPrimitiveGroupKey, VnfPrimitiveGroup> values) {
        this._vnfPrimitiveGroup = values;
        return this;
    }
    
    /**
      * Utility migration setter.
      *
      * <b>IMPORTANT NOTE</b>: This method does not completely match previous mechanics, as the list is processed as
      *                        during this method's execution. Any future modifications of the list are <b>NOT</b>
      *                        reflected in this builder nor its products.
      *
      * @param values Legacy List of values
      * @return this builder
      * @throws IllegalArgumentException if the list contains entries with the same key
      * @throws NullPointerException if the list contains a null entry
      * @deprecated Use {#link #setVnfPrimitiveGroup(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public GetNsConfigPrimitiveValuesOutputBuilder setVnfPrimitiveGroup(final List<VnfPrimitiveGroup> values) {
        return setVnfPrimitiveGroup(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public GetNsConfigPrimitiveValuesOutputBuilder addAugmentation(Augmentation<GetNsConfigPrimitiveValuesOutput> augmentation) {
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
    public GetNsConfigPrimitiveValuesOutputBuilder addAugmentation(Class<? extends Augmentation<GetNsConfigPrimitiveValuesOutput>> augmentationType, Augmentation<GetNsConfigPrimitiveValuesOutput> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public GetNsConfigPrimitiveValuesOutputBuilder removeAugmentation(Class<? extends Augmentation<GetNsConfigPrimitiveValuesOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private GetNsConfigPrimitiveValuesOutputBuilder doAddAugmentation(Class<? extends Augmentation<GetNsConfigPrimitiveValuesOutput>> augmentationType, Augmentation<GetNsConfigPrimitiveValuesOutput> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public GetNsConfigPrimitiveValuesOutput build() {
        return new GetNsConfigPrimitiveValuesOutputImpl(this);
    }

    private static final class GetNsConfigPrimitiveValuesOutputImpl
        extends AbstractAugmentable<GetNsConfigPrimitiveValuesOutput>
        implements GetNsConfigPrimitiveValuesOutput {
    
        private final Map<NsParameterKey, NsParameter> _nsParameter;
        private final Map<NsParameterGroupKey, NsParameterGroup> _nsParameterGroup;
        private final Map<VnfPrimitiveGroupKey, VnfPrimitiveGroup> _vnfPrimitiveGroup;
    
        GetNsConfigPrimitiveValuesOutputImpl(GetNsConfigPrimitiveValuesOutputBuilder base) {
            super(base.augmentation);
            this._nsParameter = CodeHelpers.emptyToNull(base.getNsParameter());
            this._nsParameterGroup = CodeHelpers.emptyToNull(base.getNsParameterGroup());
            this._vnfPrimitiveGroup = CodeHelpers.emptyToNull(base.getVnfPrimitiveGroup());
        }
    
        @Override
        public Map<NsParameterKey, NsParameter> getNsParameter() {
            return _nsParameter;
        }
        
        @Override
        public Map<NsParameterGroupKey, NsParameterGroup> getNsParameterGroup() {
            return _nsParameterGroup;
        }
        
        @Override
        public Map<VnfPrimitiveGroupKey, VnfPrimitiveGroup> getVnfPrimitiveGroup() {
            return _vnfPrimitiveGroup;
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
            result = prime * result + Objects.hashCode(_nsParameter);
            result = prime * result + Objects.hashCode(_nsParameterGroup);
            result = prime * result + Objects.hashCode(_vnfPrimitiveGroup);
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
            if (!GetNsConfigPrimitiveValuesOutput.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            GetNsConfigPrimitiveValuesOutput other = (GetNsConfigPrimitiveValuesOutput)obj;
            if (!Objects.equals(_nsParameter, other.getNsParameter())) {
                return false;
            }
            if (!Objects.equals(_nsParameterGroup, other.getNsParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_vnfPrimitiveGroup, other.getVnfPrimitiveGroup())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetNsConfigPrimitiveValuesOutputImpl otherImpl = (GetNsConfigPrimitiveValuesOutputImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<GetNsConfigPrimitiveValuesOutput>>, Augmentation<GetNsConfigPrimitiveValuesOutput>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("GetNsConfigPrimitiveValuesOutput");
            CodeHelpers.appendValue(helper, "_nsParameter", _nsParameter);
            CodeHelpers.appendValue(helper, "_nsParameterGroup", _nsParameterGroup);
            CodeHelpers.appendValue(helper, "_vnfPrimitiveGroup", _vnfPrimitiveGroup);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
