package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions.Alarm;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions.AlarmKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions.InsufficientData;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions.InsufficientDataKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions.Ok;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions.OkKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ActionsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ActionsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ActionsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ActionsBuilder, as instances can be freely passed around without
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
 * @see ActionsBuilder
 * @see Builder
 *
 */
public class ActionsBuilder implements Builder<Actions> {

    private Map<AlarmKey, Alarm> _alarm;
    private Map<InsufficientDataKey, InsufficientData> _insufficientData;
    private Map<OkKey, Ok> _ok;


    Map<Class<? extends Augmentation<Actions>>, Augmentation<Actions>> augmentation = Collections.emptyMap();

    public ActionsBuilder() {
    }

    public ActionsBuilder(Actions base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Actions>>, Augmentation<Actions>> aug =((AugmentationHolder<Actions>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._alarm = base.getAlarm();
        this._insufficientData = base.getInsufficientData();
        this._ok = base.getOk();
    }


    public Map<AlarmKey, Alarm> getAlarm() {
        return _alarm;
    }
    
    public Map<InsufficientDataKey, InsufficientData> getInsufficientData() {
        return _insufficientData;
    }
    
    public Map<OkKey, Ok> getOk() {
        return _ok;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Actions>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ActionsBuilder setAlarm(final Map<AlarmKey, Alarm> values) {
        this._alarm = values;
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
      * @deprecated Use {#link #setAlarm(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ActionsBuilder setAlarm(final List<Alarm> values) {
        return setAlarm(CodeHelpers.compatMap(values));
    }
    public ActionsBuilder setInsufficientData(final Map<InsufficientDataKey, InsufficientData> values) {
        this._insufficientData = values;
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
      * @deprecated Use {#link #setInsufficientData(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ActionsBuilder setInsufficientData(final List<InsufficientData> values) {
        return setInsufficientData(CodeHelpers.compatMap(values));
    }
    public ActionsBuilder setOk(final Map<OkKey, Ok> values) {
        this._ok = values;
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
      * @deprecated Use {#link #setOk(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ActionsBuilder setOk(final List<Ok> values) {
        return setOk(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ActionsBuilder addAugmentation(Augmentation<Actions> augmentation) {
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
    public ActionsBuilder addAugmentation(Class<? extends Augmentation<Actions>> augmentationType, Augmentation<Actions> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ActionsBuilder removeAugmentation(Class<? extends Augmentation<Actions>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ActionsBuilder doAddAugmentation(Class<? extends Augmentation<Actions>> augmentationType, Augmentation<Actions> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Actions build() {
        return new ActionsImpl(this);
    }

    private static final class ActionsImpl
        extends AbstractAugmentable<Actions>
        implements Actions {
    
        private final Map<AlarmKey, Alarm> _alarm;
        private final Map<InsufficientDataKey, InsufficientData> _insufficientData;
        private final Map<OkKey, Ok> _ok;
    
        ActionsImpl(ActionsBuilder base) {
            super(base.augmentation);
            this._alarm = CodeHelpers.emptyToNull(base.getAlarm());
            this._insufficientData = CodeHelpers.emptyToNull(base.getInsufficientData());
            this._ok = CodeHelpers.emptyToNull(base.getOk());
        }
    
        @Override
        public Map<AlarmKey, Alarm> getAlarm() {
            return _alarm;
        }
        
        @Override
        public Map<InsufficientDataKey, InsufficientData> getInsufficientData() {
            return _insufficientData;
        }
        
        @Override
        public Map<OkKey, Ok> getOk() {
            return _ok;
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
            result = prime * result + Objects.hashCode(_alarm);
            result = prime * result + Objects.hashCode(_insufficientData);
            result = prime * result + Objects.hashCode(_ok);
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
            if (!Actions.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Actions other = (Actions)obj;
            if (!Objects.equals(_alarm, other.getAlarm())) {
                return false;
            }
            if (!Objects.equals(_insufficientData, other.getInsufficientData())) {
                return false;
            }
            if (!Objects.equals(_ok, other.getOk())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ActionsImpl otherImpl = (ActionsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Actions>>, Augmentation<Actions>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Actions");
            CodeHelpers.appendValue(helper, "_alarm", _alarm);
            CodeHelpers.appendValue(helper, "_insufficientData", _insufficientData);
            CodeHelpers.appendValue(helper, "_ok", _ok);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
