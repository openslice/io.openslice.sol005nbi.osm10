package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.InternalLifecycleManagementScriptEvent;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.lifecycle.management.script.ScriptInput;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.lifecycle.management.script.ScriptInputKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link LifecycleManagementScriptBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     LifecycleManagementScriptBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new LifecycleManagementScriptBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of LifecycleManagementScriptBuilder, as instances can be freely passed around without
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
 * @see LifecycleManagementScriptBuilder
 * @see Builder
 *
 */
public class LifecycleManagementScriptBuilder implements Builder<LifecycleManagementScript> {

    private List<InternalLifecycleManagementScriptEvent> _event;
    private String _id;
    private List<String> _lcmTransitionEvent;
    private String _script;
    private String _scriptDsl;
    private Map<ScriptInputKey, ScriptInput> _scriptInput;
    private LifecycleManagementScriptKey key;


    Map<Class<? extends Augmentation<LifecycleManagementScript>>, Augmentation<LifecycleManagementScript>> augmentation = Collections.emptyMap();

    public LifecycleManagementScriptBuilder() {
    }

    public LifecycleManagementScriptBuilder(LifecycleManagementScript base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<LifecycleManagementScript>>, Augmentation<LifecycleManagementScript>> aug =((AugmentationHolder<LifecycleManagementScript>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._event = base.getEvent();
        this._lcmTransitionEvent = base.getLcmTransitionEvent();
        this._script = base.getScript();
        this._scriptDsl = base.getScriptDsl();
        this._scriptInput = base.getScriptInput();
    }


    public LifecycleManagementScriptKey key() {
        return key;
    }
    
    public List<InternalLifecycleManagementScriptEvent> getEvent() {
        return _event;
    }
    
    public String getId() {
        return _id;
    }
    
    public List<String> getLcmTransitionEvent() {
        return _lcmTransitionEvent;
    }
    
    public String getScript() {
        return _script;
    }
    
    public String getScriptDsl() {
        return _scriptDsl;
    }
    
    public Map<ScriptInputKey, ScriptInput> getScriptInput() {
        return _scriptInput;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<LifecycleManagementScript>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public LifecycleManagementScriptBuilder withKey(final LifecycleManagementScriptKey key) {
        this.key = key;
        return this;
    }
    public LifecycleManagementScriptBuilder setEvent(final List<InternalLifecycleManagementScriptEvent> values) {
        this._event = values;
        return this;
    }
    
    
    public LifecycleManagementScriptBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public LifecycleManagementScriptBuilder setLcmTransitionEvent(final List<String> values) {
        this._lcmTransitionEvent = values;
        return this;
    }
    
    
    public LifecycleManagementScriptBuilder setScript(final String value) {
        this._script = value;
        return this;
    }
    
    public LifecycleManagementScriptBuilder setScriptDsl(final String value) {
        this._scriptDsl = value;
        return this;
    }
    public LifecycleManagementScriptBuilder setScriptInput(final Map<ScriptInputKey, ScriptInput> values) {
        this._scriptInput = values;
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
      * @deprecated Use {#link #setScriptInput(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public LifecycleManagementScriptBuilder setScriptInput(final List<ScriptInput> values) {
        return setScriptInput(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public LifecycleManagementScriptBuilder addAugmentation(Augmentation<LifecycleManagementScript> augmentation) {
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
    public LifecycleManagementScriptBuilder addAugmentation(Class<? extends Augmentation<LifecycleManagementScript>> augmentationType, Augmentation<LifecycleManagementScript> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public LifecycleManagementScriptBuilder removeAugmentation(Class<? extends Augmentation<LifecycleManagementScript>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private LifecycleManagementScriptBuilder doAddAugmentation(Class<? extends Augmentation<LifecycleManagementScript>> augmentationType, Augmentation<LifecycleManagementScript> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public LifecycleManagementScript build() {
        return new LifecycleManagementScriptImpl(this);
    }

    private static final class LifecycleManagementScriptImpl
        extends AbstractAugmentable<LifecycleManagementScript>
        implements LifecycleManagementScript {
    
        private final List<InternalLifecycleManagementScriptEvent> _event;
        private final String _id;
        private final List<String> _lcmTransitionEvent;
        private final String _script;
        private final String _scriptDsl;
        private final Map<ScriptInputKey, ScriptInput> _scriptInput;
        private final LifecycleManagementScriptKey key;
    
        LifecycleManagementScriptImpl(LifecycleManagementScriptBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new LifecycleManagementScriptKey(base.getId());
            }
            this._id = key.getId();
            this._event = base.getEvent();
            this._lcmTransitionEvent = base.getLcmTransitionEvent();
            this._script = base.getScript();
            this._scriptDsl = base.getScriptDsl();
            this._scriptInput = CodeHelpers.emptyToNull(base.getScriptInput());
        }
    
        @Override
        public LifecycleManagementScriptKey key() {
            return key;
        }
        
        @Override
        public List<InternalLifecycleManagementScriptEvent> getEvent() {
            return _event;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public List<String> getLcmTransitionEvent() {
            return _lcmTransitionEvent;
        }
        
        @Override
        public String getScript() {
            return _script;
        }
        
        @Override
        public String getScriptDsl() {
            return _scriptDsl;
        }
        
        @Override
        public Map<ScriptInputKey, ScriptInput> getScriptInput() {
            return _scriptInput;
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
            result = prime * result + Objects.hashCode(_event);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_lcmTransitionEvent);
            result = prime * result + Objects.hashCode(_script);
            result = prime * result + Objects.hashCode(_scriptDsl);
            result = prime * result + Objects.hashCode(_scriptInput);
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
            if (!LifecycleManagementScript.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            LifecycleManagementScript other = (LifecycleManagementScript)obj;
            if (!Objects.equals(_event, other.getEvent())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_lcmTransitionEvent, other.getLcmTransitionEvent())) {
                return false;
            }
            if (!Objects.equals(_script, other.getScript())) {
                return false;
            }
            if (!Objects.equals(_scriptDsl, other.getScriptDsl())) {
                return false;
            }
            if (!Objects.equals(_scriptInput, other.getScriptInput())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LifecycleManagementScriptImpl otherImpl = (LifecycleManagementScriptImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<LifecycleManagementScript>>, Augmentation<LifecycleManagementScript>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("LifecycleManagementScript");
            CodeHelpers.appendValue(helper, "_event", _event);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_lcmTransitionEvent", _lcmTransitionEvent);
            CodeHelpers.appendValue(helper, "_script", _script);
            CodeHelpers.appendValue(helper, "_scriptDsl", _scriptDsl);
            CodeHelpers.appendValue(helper, "_scriptInput", _scriptInput);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
