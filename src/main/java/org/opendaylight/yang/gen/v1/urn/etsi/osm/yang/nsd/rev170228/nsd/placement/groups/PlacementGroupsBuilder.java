package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.placement.groups;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo.Strategy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfdKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link PlacementGroupsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     PlacementGroupsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new PlacementGroupsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of PlacementGroupsBuilder, as instances can be freely passed around without
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
 * @see PlacementGroupsBuilder
 * @see Builder
 *
 */
public class PlacementGroupsBuilder implements Builder<PlacementGroups> {

    private Map<MemberVnfdKey, MemberVnfd> _memberVnfd;
    private String _name;
    private String _requirement;
    private Strategy _strategy;
    private PlacementGroupsKey key;


    Map<Class<? extends Augmentation<PlacementGroups>>, Augmentation<PlacementGroups>> augmentation = Collections.emptyMap();

    public PlacementGroupsBuilder() {
    }
    public PlacementGroupsBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo arg) {
        this._name = arg.getName();
        this._requirement = arg.getRequirement();
        this._strategy = arg.getStrategy();
    }

    public PlacementGroupsBuilder(PlacementGroups base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<PlacementGroups>>, Augmentation<PlacementGroups>> aug =((AugmentationHolder<PlacementGroups>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._memberVnfd = base.getMemberVnfd();
        this._requirement = base.getRequirement();
        this._strategy = base.getStrategy();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo)arg).getName();
            this._requirement = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo)arg).getRequirement();
            this._strategy = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo)arg).getStrategy();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo]");
    }

    public PlacementGroupsKey key() {
        return key;
    }
    
    public Map<MemberVnfdKey, MemberVnfd> getMemberVnfd() {
        return _memberVnfd;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getRequirement() {
        return _requirement;
    }
    
    public Strategy getStrategy() {
        return _strategy;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<PlacementGroups>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public PlacementGroupsBuilder withKey(final PlacementGroupsKey key) {
        this.key = key;
        return this;
    }
    public PlacementGroupsBuilder setMemberVnfd(final Map<MemberVnfdKey, MemberVnfd> values) {
        this._memberVnfd = values;
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
      * @deprecated Use {#link #setMemberVnfd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public PlacementGroupsBuilder setMemberVnfd(final List<MemberVnfd> values) {
        return setMemberVnfd(CodeHelpers.compatMap(values));
    }
    
    public PlacementGroupsBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public PlacementGroupsBuilder setRequirement(final String value) {
        this._requirement = value;
        return this;
    }
    
    public PlacementGroupsBuilder setStrategy(final Strategy value) {
        this._strategy = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public PlacementGroupsBuilder addAugmentation(Augmentation<PlacementGroups> augmentation) {
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
    public PlacementGroupsBuilder addAugmentation(Class<? extends Augmentation<PlacementGroups>> augmentationType, Augmentation<PlacementGroups> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public PlacementGroupsBuilder removeAugmentation(Class<? extends Augmentation<PlacementGroups>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private PlacementGroupsBuilder doAddAugmentation(Class<? extends Augmentation<PlacementGroups>> augmentationType, Augmentation<PlacementGroups> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public PlacementGroups build() {
        return new PlacementGroupsImpl(this);
    }

    private static final class PlacementGroupsImpl
        extends AbstractAugmentable<PlacementGroups>
        implements PlacementGroups {
    
        private final Map<MemberVnfdKey, MemberVnfd> _memberVnfd;
        private final String _name;
        private final String _requirement;
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo.Strategy _strategy;
        private final PlacementGroupsKey key;
    
        PlacementGroupsImpl(PlacementGroupsBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new PlacementGroupsKey(base.getName());
            }
            this._name = key.getName();
            this._memberVnfd = CodeHelpers.emptyToNull(base.getMemberVnfd());
            this._requirement = base.getRequirement();
            this._strategy = base.getStrategy();
        }
    
        @Override
        public PlacementGroupsKey key() {
            return key;
        }
        
        @Override
        public Map<MemberVnfdKey, MemberVnfd> getMemberVnfd() {
            return _memberVnfd;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getRequirement() {
            return _requirement;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo.Strategy getStrategy() {
            return _strategy;
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
            result = prime * result + Objects.hashCode(_memberVnfd);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_requirement);
            result = prime * result + Objects.hashCode(_strategy);
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
            if (!PlacementGroups.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            PlacementGroups other = (PlacementGroups)obj;
            if (!Objects.equals(_memberVnfd, other.getMemberVnfd())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_requirement, other.getRequirement())) {
                return false;
            }
            if (!Objects.equals(_strategy, other.getStrategy())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PlacementGroupsImpl otherImpl = (PlacementGroupsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<PlacementGroups>>, Augmentation<PlacementGroups>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("PlacementGroups");
            CodeHelpers.appendValue(helper, "_memberVnfd", _memberVnfd);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_requirement", _requirement);
            CodeHelpers.appendValue(helper, "_strategy", _strategy);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
