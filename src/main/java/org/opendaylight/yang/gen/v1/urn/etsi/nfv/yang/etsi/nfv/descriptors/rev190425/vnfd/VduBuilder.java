package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.BootOrder;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.ConfigurableProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.ConfigurablePropertiesKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.IntCpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.IntCpdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.MonitoringParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.MonitoringParameterKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VduBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VduBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VduBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VduBuilder, as instances can be freely passed around without
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
 * @see VduBuilder
 * @see Builder
 *
 */
public class VduBuilder implements Builder<Vdu> {

    private String _bootData;
    private List<BootOrder> _bootOrder;
    private Map<ConfigurablePropertiesKey, ConfigurableProperties> _configurableProperties;
    private String _description;
    private String _id;
    private Map<IntCpdKey, IntCpd> _intCpd;
    private Map<MonitoringParameterKey, MonitoringParameter> _monitoringParameter;
    private String _name;
    private List<String> _nfviConstraint;
    private String _swImageDesc;
    private String _virtualComputeDesc;
    private List<String> _virtualStorageDesc;
    private VduKey key;


    Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> augmentation = Collections.emptyMap();

    public VduBuilder() {
    }

    public VduBuilder(Vdu base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> aug =((AugmentationHolder<Vdu>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._bootData = base.getBootData();
        this._bootOrder = base.getBootOrder();
        this._configurableProperties = base.getConfigurableProperties();
        this._description = base.getDescription();
        this._intCpd = base.getIntCpd();
        this._monitoringParameter = base.getMonitoringParameter();
        this._name = base.getName();
        this._nfviConstraint = base.getNfviConstraint();
        this._swImageDesc = base.getSwImageDesc();
        this._virtualComputeDesc = base.getVirtualComputeDesc();
        this._virtualStorageDesc = base.getVirtualStorageDesc();
    }


    public VduKey key() {
        return key;
    }
    
    public String getBootData() {
        return _bootData;
    }
    
    public List<BootOrder> getBootOrder() {
        return _bootOrder;
    }
    
    public Map<ConfigurablePropertiesKey, ConfigurableProperties> getConfigurableProperties() {
        return _configurableProperties;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<IntCpdKey, IntCpd> getIntCpd() {
        return _intCpd;
    }
    
    public Map<MonitoringParameterKey, MonitoringParameter> getMonitoringParameter() {
        return _monitoringParameter;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<String> getNfviConstraint() {
        return _nfviConstraint;
    }
    
    public String getSwImageDesc() {
        return _swImageDesc;
    }
    
    public String getVirtualComputeDesc() {
        return _virtualComputeDesc;
    }
    
    public List<String> getVirtualStorageDesc() {
        return _virtualStorageDesc;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vdu>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VduBuilder withKey(final VduKey key) {
        this.key = key;
        return this;
    }
    
    public VduBuilder setBootData(final String value) {
        this._bootData = value;
        return this;
    }
    public VduBuilder setBootOrder(final List<BootOrder> values) {
        this._bootOrder = values;
        return this;
    }
    
    public VduBuilder setConfigurableProperties(final Map<ConfigurablePropertiesKey, ConfigurableProperties> values) {
        this._configurableProperties = values;
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
      * @deprecated Use {#link #setConfigurableProperties(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VduBuilder setConfigurableProperties(final List<ConfigurableProperties> values) {
        return setConfigurableProperties(CodeHelpers.compatMap(values));
    }
    
    public VduBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VduBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public VduBuilder setIntCpd(final Map<IntCpdKey, IntCpd> values) {
        this._intCpd = values;
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
      * @deprecated Use {#link #setIntCpd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VduBuilder setIntCpd(final List<IntCpd> values) {
        return setIntCpd(CodeHelpers.compatMap(values));
    }
    public VduBuilder setMonitoringParameter(final Map<MonitoringParameterKey, MonitoringParameter> values) {
        this._monitoringParameter = values;
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
      * @deprecated Use {#link #setMonitoringParameter(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VduBuilder setMonitoringParameter(final List<MonitoringParameter> values) {
        return setMonitoringParameter(CodeHelpers.compatMap(values));
    }
    
    public VduBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public VduBuilder setNfviConstraint(final List<String> values) {
        this._nfviConstraint = values;
        return this;
    }
    
    
    public VduBuilder setSwImageDesc(final String value) {
        this._swImageDesc = value;
        return this;
    }
    
    public VduBuilder setVirtualComputeDesc(final String value) {
        this._virtualComputeDesc = value;
        return this;
    }
    public VduBuilder setVirtualStorageDesc(final List<String> values) {
        this._virtualStorageDesc = values;
        return this;
    }
    
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VduBuilder addAugmentation(Augmentation<Vdu> augmentation) {
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
    public VduBuilder addAugmentation(Class<? extends Augmentation<Vdu>> augmentationType, Augmentation<Vdu> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VduBuilder removeAugmentation(Class<? extends Augmentation<Vdu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VduBuilder doAddAugmentation(Class<? extends Augmentation<Vdu>> augmentationType, Augmentation<Vdu> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vdu build() {
        return new VduImpl(this);
    }

    public static final class VduImpl
        extends AbstractAugmentable<Vdu>
        implements Vdu {
    
        private final String _bootData;
        private final List<BootOrder> _bootOrder;
        private final Map<ConfigurablePropertiesKey, ConfigurableProperties> _configurableProperties;
        private final String _description;
        @JsonProperty("id")         
        private final String _id;
        private final Map<IntCpdKey, IntCpd> _intCpd;
        private final Map<MonitoringParameterKey, MonitoringParameter> _monitoringParameter;
        @JsonProperty("name")         
        private final String _name;
        private final List<String> _nfviConstraint;
        @JsonProperty("sw-image-desc")         
        private final String _swImageDesc;
        private final String _virtualComputeDesc;
        private final List<String> _virtualStorageDesc;
        private VduKey key;
    
        VduImpl(VduBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VduKey(base.getId());
            }
            this._id = key.getId();
            this._bootData = base.getBootData();
            this._bootOrder = CodeHelpers.emptyToNull(base.getBootOrder());
            this._configurableProperties = CodeHelpers.emptyToNull(base.getConfigurableProperties());
            this._description = base.getDescription();
            this._intCpd = CodeHelpers.emptyToNull(base.getIntCpd());
            this._monitoringParameter = CodeHelpers.emptyToNull(base.getMonitoringParameter());
            this._name = base.getName();
            this._nfviConstraint = base.getNfviConstraint();
            this._swImageDesc = base.getSwImageDesc();
            this._virtualComputeDesc = base.getVirtualComputeDesc();
            this._virtualStorageDesc = base.getVirtualStorageDesc();
        }
    
        public VduImpl() {
        	this( new VduBuilder());
        }
        
        
        @Override
        public VduKey key() {        	
        	if ( ( key != null) && ( key.getId() == null) && ( _id != null) ) {
        		key = new VduKey(_id);        		
        	}        	
            return key;
        }
        
        @Override
        public String getBootData() {
            return _bootData;
        }
        
        @Override
        public List<BootOrder> getBootOrder() {
            return _bootOrder;
        }
        
        @Override
        public Map<ConfigurablePropertiesKey, ConfigurableProperties> getConfigurableProperties() {
            return _configurableProperties;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Map<IntCpdKey, IntCpd> getIntCpd() {
            return _intCpd;
        }
        
        @Override
        public Map<MonitoringParameterKey, MonitoringParameter> getMonitoringParameter() {
            return _monitoringParameter;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<String> getNfviConstraint() {
            return _nfviConstraint;
        }
        
        @Override
        public String getSwImageDesc() {
            return _swImageDesc;
        }
        
        @Override
        public String getVirtualComputeDesc() {
            return _virtualComputeDesc;
        }
        
        @Override
        public List<String> getVirtualStorageDesc() {
            return _virtualStorageDesc;
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
            result = prime * result + Objects.hashCode(_bootData);
            result = prime * result + Objects.hashCode(_bootOrder);
            result = prime * result + Objects.hashCode(_configurableProperties);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_intCpd);
            result = prime * result + Objects.hashCode(_monitoringParameter);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nfviConstraint);
            result = prime * result + Objects.hashCode(_swImageDesc);
            result = prime * result + Objects.hashCode(_virtualComputeDesc);
            result = prime * result + Objects.hashCode(_virtualStorageDesc);
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
            if (!Vdu.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vdu other = (Vdu)obj;
            if (!Objects.equals(_bootData, other.getBootData())) {
                return false;
            }
            if (!Objects.equals(_bootOrder, other.getBootOrder())) {
                return false;
            }
            if (!Objects.equals(_configurableProperties, other.getConfigurableProperties())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_intCpd, other.getIntCpd())) {
                return false;
            }
            if (!Objects.equals(_monitoringParameter, other.getMonitoringParameter())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nfviConstraint, other.getNfviConstraint())) {
                return false;
            }
            if (!Objects.equals(_swImageDesc, other.getSwImageDesc())) {
                return false;
            }
            if (!Objects.equals(_virtualComputeDesc, other.getVirtualComputeDesc())) {
                return false;
            }
            if (!Objects.equals(_virtualStorageDesc, other.getVirtualStorageDesc())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduImpl otherImpl = (VduImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vdu");
            CodeHelpers.appendValue(helper, "_bootData", _bootData);
            CodeHelpers.appendValue(helper, "_bootOrder", _bootOrder);
            CodeHelpers.appendValue(helper, "_configurableProperties", _configurableProperties);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_intCpd", _intCpd);
            CodeHelpers.appendValue(helper, "_monitoringParameter", _monitoringParameter);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nfviConstraint", _nfviConstraint);
            CodeHelpers.appendValue(helper, "_swImageDesc", _swImageDesc);
            CodeHelpers.appendValue(helper, "_virtualComputeDesc", _virtualComputeDesc);
            CodeHelpers.appendValue(helper, "_virtualStorageDesc", _virtualStorageDesc);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
