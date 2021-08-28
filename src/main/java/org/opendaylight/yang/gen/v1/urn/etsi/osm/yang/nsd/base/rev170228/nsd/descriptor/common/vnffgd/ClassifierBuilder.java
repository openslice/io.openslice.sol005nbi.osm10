package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.classifier.common.MatchAttributes;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.classifier.common.MatchAttributesKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ClassifierBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ClassifierBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ClassifierBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ClassifierBuilder, as instances can be freely passed around without
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
 * @see ClassifierBuilder
 * @see Builder
 *
 */
public class ClassifierBuilder implements Builder<Classifier> {

    private String _id;
    private Map<MatchAttributesKey, MatchAttributes> _matchAttributes;
    private Object _memberVnfIndexRef;
    private String _name;
    private Object _rspIdRef;
    private String _vnfdConnectionPointRef;
    private Object _vnfdIdRef;
    private ClassifierKey key;


    Map<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> augmentation = Collections.emptyMap();

    public ClassifierBuilder() {
    }
    public ClassifierBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._rspIdRef = arg.getRspIdRef();
        this._matchAttributes = arg.getMatchAttributes();
    }

    public ClassifierBuilder(Classifier base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> aug =((AugmentationHolder<Classifier>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._matchAttributes = base.getMatchAttributes();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._name = base.getName();
        this._rspIdRef = base.getRspIdRef();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        this._vnfdIdRef = base.getVnfdIdRef();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon)arg).getName();
            this._rspIdRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon)arg).getRspIdRef();
            this._matchAttributes = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon)arg).getMatchAttributes();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon]");
    }

    public ClassifierKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<MatchAttributesKey, MatchAttributes> getMatchAttributes() {
        return _matchAttributes;
    }
    
    public Object getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public String getName() {
        return _name;
    }
    
    public Object getRspIdRef() {
        return _rspIdRef;
    }
    
    public String getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    public Object getVnfdIdRef() {
        return _vnfdIdRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Classifier>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ClassifierBuilder withKey(final ClassifierKey key) {
        this.key = key;
        return this;
    }
    
    public ClassifierBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public ClassifierBuilder setMatchAttributes(final Map<MatchAttributesKey, MatchAttributes> values) {
        this._matchAttributes = values;
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
      * @deprecated Use {#link #setMatchAttributes(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ClassifierBuilder setMatchAttributes(final List<MatchAttributes> values) {
        return setMatchAttributes(CodeHelpers.compatMap(values));
    }
    
    public ClassifierBuilder setMemberVnfIndexRef(final Object value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public ClassifierBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ClassifierBuilder setRspIdRef(final Object value) {
        this._rspIdRef = value;
        return this;
    }
    
    public ClassifierBuilder setVnfdConnectionPointRef(final String value) {
        this._vnfdConnectionPointRef = value;
        return this;
    }
    
    public ClassifierBuilder setVnfdIdRef(final Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ClassifierBuilder addAugmentation(Augmentation<Classifier> augmentation) {
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
    public ClassifierBuilder addAugmentation(Class<? extends Augmentation<Classifier>> augmentationType, Augmentation<Classifier> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ClassifierBuilder removeAugmentation(Class<? extends Augmentation<Classifier>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ClassifierBuilder doAddAugmentation(Class<? extends Augmentation<Classifier>> augmentationType, Augmentation<Classifier> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Classifier build() {
        return new ClassifierImpl(this);
    }

    private static final class ClassifierImpl
        extends AbstractAugmentable<Classifier>
        implements Classifier {
    
        private final String _id;
        private final Map<MatchAttributesKey, MatchAttributes> _matchAttributes;
        private final Object _memberVnfIndexRef;
        private final String _name;
        private final Object _rspIdRef;
        private final String _vnfdConnectionPointRef;
        private final Object _vnfdIdRef;
        private final ClassifierKey key;
    
        ClassifierImpl(ClassifierBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ClassifierKey(base.getId());
            }
            this._id = key.getId();
            this._matchAttributes = CodeHelpers.emptyToNull(base.getMatchAttributes());
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            this._name = base.getName();
            this._rspIdRef = base.getRspIdRef();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            this._vnfdIdRef = base.getVnfdIdRef();
        }
    
        @Override
        public ClassifierKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Map<MatchAttributesKey, MatchAttributes> getMatchAttributes() {
            return _matchAttributes;
        }
        
        @Override
        public Object getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Object getRspIdRef() {
            return _rspIdRef;
        }
        
        @Override
        public String getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @Override
        public Object getVnfdIdRef() {
            return _vnfdIdRef;
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_matchAttributes);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_rspIdRef);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
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
            if (!Classifier.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Classifier other = (Classifier)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_matchAttributes, other.getMatchAttributes())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_rspIdRef, other.getRspIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ClassifierImpl otherImpl = (ClassifierImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Classifier");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_matchAttributes", _matchAttributes);
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_rspIdRef", _rspIdRef);
            CodeHelpers.appendValue(helper, "_vnfdConnectionPointRef", _vnfdConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
