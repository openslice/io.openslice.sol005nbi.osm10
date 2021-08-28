package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link HelmChartBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     HelmChartBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new HelmChartBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of HelmChartBuilder, as instances can be freely passed around without
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
 * @see HelmChartBuilder
 * @see Builder
 *
 */
public class HelmChartBuilder implements Builder<HelmChart> {

    private String _helmChart;
    private HelmChart.HelmVersion _helmVersion;


    Map<Class<? extends Augmentation<HelmChart>>, Augmentation<HelmChart>> augmentation = Collections.emptyMap();

    public HelmChartBuilder() {
    }

    public HelmChartBuilder(HelmChart base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<HelmChart>>, Augmentation<HelmChart>> aug =((AugmentationHolder<HelmChart>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._helmChart = base.getHelmChart();
        this._helmVersion = base.getHelmVersion();
    }


    public String getHelmChart() {
        return _helmChart;
    }
    
    public HelmChart.HelmVersion getHelmVersion() {
        return _helmVersion;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<HelmChart>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public HelmChartBuilder setHelmChart(final String value) {
        this._helmChart = value;
        return this;
    }
    
    public HelmChartBuilder setHelmVersion(final HelmChart.HelmVersion value) {
        this._helmVersion = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public HelmChartBuilder addAugmentation(Augmentation<HelmChart> augmentation) {
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
    public HelmChartBuilder addAugmentation(Class<? extends Augmentation<HelmChart>> augmentationType, Augmentation<HelmChart> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public HelmChartBuilder removeAugmentation(Class<? extends Augmentation<HelmChart>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private HelmChartBuilder doAddAugmentation(Class<? extends Augmentation<HelmChart>> augmentationType, Augmentation<HelmChart> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public HelmChart build() {
        return new HelmChartImpl(this);
    }

    private static final class HelmChartImpl
        extends AbstractAugmentable<HelmChart>
        implements HelmChart {
    
        private final String _helmChart;
        private final HelmChart.HelmVersion _helmVersion;
    
        HelmChartImpl(HelmChartBuilder base) {
            super(base.augmentation);
            this._helmChart = base.getHelmChart();
            this._helmVersion = base.getHelmVersion();
        }
    
        @Override
        public String getHelmChart() {
            return _helmChart;
        }
        
        @Override
        public HelmChart.HelmVersion getHelmVersion() {
            return _helmVersion;
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
            result = prime * result + Objects.hashCode(_helmChart);
            result = prime * result + Objects.hashCode(_helmVersion);
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
            if (!HelmChart.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            HelmChart other = (HelmChart)obj;
            if (!Objects.equals(_helmChart, other.getHelmChart())) {
                return false;
            }
            if (!Objects.equals(_helmVersion, other.getHelmVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HelmChartImpl otherImpl = (HelmChartImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<HelmChart>>, Augmentation<HelmChart>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("HelmChart");
            CodeHelpers.appendValue(helper, "_helmChart", _helmChart);
            CodeHelpers.appendValue(helper, "_helmVersion", _helmVersion);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
