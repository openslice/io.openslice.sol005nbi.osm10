package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmSeverityType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmStatisticType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RelationalOperationType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.Actions;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link AlarmBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     AlarmBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new AlarmBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of AlarmBuilder, as instances can be freely passed around without
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
 * @see AlarmBuilder
 * @see Builder
 *
 */
public class AlarmBuilder implements Builder<Alarm> {

    private Actions _actions;
    private String _alarmId;
    private String _description;
    private Uint32 _evaluations;
    private String _name;
    private RelationalOperationType _operation;
    private Uint32 _period;
    private AlarmSeverityType _severity;
    private AlarmStatisticType _statistic;
    private BigDecimal _value;
    private String _vdurId;
    private String _vnfMonitoringParamRef;
    private Boolean _enabled;
    private Boolean _repeat;
    private AlarmKey key;


    Map<Class<? extends Augmentation<Alarm>>, Augmentation<Alarm>> augmentation = Collections.emptyMap();

    public AlarmBuilder() {
    }
    public AlarmBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties arg) {
        this._name = arg.getName();
        this._description = arg.getDescription();
        this._vdurId = arg.getVdurId();
        this._actions = arg.getActions();
        this._repeat = arg.isRepeat();
        this._enabled = arg.isEnabled();
        this._severity = arg.getSeverity();
        this._statistic = arg.getStatistic();
        this._operation = arg.getOperation();
        this._value = arg.getValue();
        this._period = arg.getPeriod();
        this._evaluations = arg.getEvaluations();
    }

    public AlarmBuilder(Alarm base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Alarm>>, Augmentation<Alarm>> aug =((AugmentationHolder<Alarm>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._alarmId = base.getAlarmId();
        this._actions = base.getActions();
        this._description = base.getDescription();
        this._evaluations = base.getEvaluations();
        this._name = base.getName();
        this._operation = base.getOperation();
        this._period = base.getPeriod();
        this._severity = base.getSeverity();
        this._statistic = base.getStatistic();
        this._value = base.getValue();
        this._vdurId = base.getVdurId();
        this._vnfMonitoringParamRef = base.getVnfMonitoringParamRef();
        this._enabled = base.isEnabled();
        this._repeat = base.isRepeat();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getName();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getDescription();
            this._vdurId = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getVdurId();
            this._actions = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getActions();
            this._repeat = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).isRepeat();
            this._enabled = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).isEnabled();
            this._severity = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getSeverity();
            this._statistic = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getStatistic();
            this._operation = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getOperation();
            this._value = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getValue();
            this._period = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getPeriod();
            this._evaluations = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getEvaluations();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties]");
    }

    public AlarmKey key() {
        return key;
    }
    
    public Actions getActions() {
        return _actions;
    }
    
    public String getAlarmId() {
        return _alarmId;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public Uint32 getEvaluations() {
        return _evaluations;
    }
    
    public String getName() {
        return _name;
    }
    
    public RelationalOperationType getOperation() {
        return _operation;
    }
    
    public Uint32 getPeriod() {
        return _period;
    }
    
    public AlarmSeverityType getSeverity() {
        return _severity;
    }
    
    public AlarmStatisticType getStatistic() {
        return _statistic;
    }
    
    public BigDecimal getValue() {
        return _value;
    }
    
    public String getVdurId() {
        return _vdurId;
    }
    
    public String getVnfMonitoringParamRef() {
        return _vnfMonitoringParamRef;
    }
    
    public Boolean isEnabled() {
        return _enabled;
    }
    
    public Boolean isRepeat() {
        return _repeat;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Alarm>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public AlarmBuilder withKey(final AlarmKey key) {
        this.key = key;
        return this;
    }
    
    public AlarmBuilder setActions(final Actions value) {
        this._actions = value;
        return this;
    }
    
    public AlarmBuilder setAlarmId(final String value) {
        this._alarmId = value;
        return this;
    }
    
    public AlarmBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public AlarmBuilder setEvaluations(final Uint32 value) {
        this._evaluations = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setEvaluations(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public AlarmBuilder setEvaluations(final Long value) {
        return setEvaluations(CodeHelpers.compatUint(value));
    }
    
    public AlarmBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public AlarmBuilder setOperation(final RelationalOperationType value) {
        this._operation = value;
        return this;
    }
    
    public AlarmBuilder setPeriod(final Uint32 value) {
        this._period = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPeriod(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public AlarmBuilder setPeriod(final Long value) {
        return setPeriod(CodeHelpers.compatUint(value));
    }
    
    public AlarmBuilder setSeverity(final AlarmSeverityType value) {
        this._severity = value;
        return this;
    }
    
    public AlarmBuilder setStatistic(final AlarmStatisticType value) {
        this._statistic = value;
        return this;
    }
    
    
    public AlarmBuilder setValue(final BigDecimal value) {
        if (value != null) {
            
        }
        this._value = value;
        return this;
    }
    
    public AlarmBuilder setVdurId(final String value) {
        this._vdurId = value;
        return this;
    }
    
    public AlarmBuilder setVnfMonitoringParamRef(final String value) {
        this._vnfMonitoringParamRef = value;
        return this;
    }
    
    public AlarmBuilder setEnabled(final Boolean value) {
        this._enabled = value;
        return this;
    }
    
    public AlarmBuilder setRepeat(final Boolean value) {
        this._repeat = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public AlarmBuilder addAugmentation(Augmentation<Alarm> augmentation) {
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
    public AlarmBuilder addAugmentation(Class<? extends Augmentation<Alarm>> augmentationType, Augmentation<Alarm> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public AlarmBuilder removeAugmentation(Class<? extends Augmentation<Alarm>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private AlarmBuilder doAddAugmentation(Class<? extends Augmentation<Alarm>> augmentationType, Augmentation<Alarm> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Alarm build() {
        return new AlarmImpl(this);
    }

    private static final class AlarmImpl
        extends AbstractAugmentable<Alarm>
        implements Alarm {
    
        private final Actions _actions;
        private final String _alarmId;
        private final String _description;
        private final Uint32 _evaluations;
        private final String _name;
        private final RelationalOperationType _operation;
        private final Uint32 _period;
        private final AlarmSeverityType _severity;
        private final AlarmStatisticType _statistic;
        private final BigDecimal _value;
        private final String _vdurId;
        private final String _vnfMonitoringParamRef;
        private final Boolean _enabled;
        private final Boolean _repeat;
        private final AlarmKey key;
    
        AlarmImpl(AlarmBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new AlarmKey(base.getAlarmId());
            }
            this._alarmId = key.getAlarmId();
            this._actions = base.getActions();
            this._description = base.getDescription();
            this._evaluations = base.getEvaluations();
            this._name = base.getName();
            this._operation = base.getOperation();
            this._period = base.getPeriod();
            this._severity = base.getSeverity();
            this._statistic = base.getStatistic();
            this._value = base.getValue();
            this._vdurId = base.getVdurId();
            this._vnfMonitoringParamRef = base.getVnfMonitoringParamRef();
            this._enabled = base.isEnabled();
            this._repeat = base.isRepeat();
        }
    
        @Override
        public AlarmKey key() {
            return key;
        }
        
        @Override
        public Actions getActions() {
            return _actions;
        }
        
        @Override
        public String getAlarmId() {
            return _alarmId;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public Uint32 getEvaluations() {
            return _evaluations;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public RelationalOperationType getOperation() {
            return _operation;
        }
        
        @Override
        public Uint32 getPeriod() {
            return _period;
        }
        
        @Override
        public AlarmSeverityType getSeverity() {
            return _severity;
        }
        
        @Override
        public AlarmStatisticType getStatistic() {
            return _statistic;
        }
        
        @Override
        public BigDecimal getValue() {
            return _value;
        }
        
        @Override
        public String getVdurId() {
            return _vdurId;
        }
        
        @Override
        public String getVnfMonitoringParamRef() {
            return _vnfMonitoringParamRef;
        }
        
        @Override
        public Boolean isEnabled() {
            return _enabled;
        }
        
        @Override
        public Boolean isRepeat() {
            return _repeat;
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
            result = prime * result + Objects.hashCode(_actions);
            result = prime * result + Objects.hashCode(_alarmId);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_evaluations);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operation);
            result = prime * result + Objects.hashCode(_period);
            result = prime * result + Objects.hashCode(_severity);
            result = prime * result + Objects.hashCode(_statistic);
            result = prime * result + Objects.hashCode(_value);
            result = prime * result + Objects.hashCode(_vdurId);
            result = prime * result + Objects.hashCode(_vnfMonitoringParamRef);
            result = prime * result + Objects.hashCode(_enabled);
            result = prime * result + Objects.hashCode(_repeat);
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
            if (!Alarm.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Alarm other = (Alarm)obj;
            if (!Objects.equals(_actions, other.getActions())) {
                return false;
            }
            if (!Objects.equals(_alarmId, other.getAlarmId())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_evaluations, other.getEvaluations())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operation, other.getOperation())) {
                return false;
            }
            if (!Objects.equals(_period, other.getPeriod())) {
                return false;
            }
            if (!Objects.equals(_severity, other.getSeverity())) {
                return false;
            }
            if (!Objects.equals(_statistic, other.getStatistic())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (!Objects.equals(_vdurId, other.getVdurId())) {
                return false;
            }
            if (!Objects.equals(_vnfMonitoringParamRef, other.getVnfMonitoringParamRef())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (!Objects.equals(_repeat, other.isRepeat())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AlarmImpl otherImpl = (AlarmImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Alarm>>, Augmentation<Alarm>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Alarm");
            CodeHelpers.appendValue(helper, "_actions", _actions);
            CodeHelpers.appendValue(helper, "_alarmId", _alarmId);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_evaluations", _evaluations);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_operation", _operation);
            CodeHelpers.appendValue(helper, "_period", _period);
            CodeHelpers.appendValue(helper, "_severity", _severity);
            CodeHelpers.appendValue(helper, "_statistic", _statistic);
            CodeHelpers.appendValue(helper, "_value", _value);
            CodeHelpers.appendValue(helper, "_vdurId", _vdurId);
            CodeHelpers.appendValue(helper, "_vnfMonitoringParamRef", _vnfMonitoringParamRef);
            CodeHelpers.appendValue(helper, "_enabled", _enabled);
            CodeHelpers.appendValue(helper, "_repeat", _repeat);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
