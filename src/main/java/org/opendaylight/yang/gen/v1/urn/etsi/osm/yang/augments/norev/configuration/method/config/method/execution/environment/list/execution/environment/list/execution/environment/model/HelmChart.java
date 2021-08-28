package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.ExecutionEnvironmentModel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Interact with the VNF or xDU through Helm.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * case helm-chart {
 *   leaf helm-chart {
 *     type string;
 *   }
 *   leaf helm-version {
 *     type enumeration {
 *       enum v2;
 *       enum v3;
 *     }
 *     default v3;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/configuration-method/config-method/execution-environment-list/execution-environment-list/execution-environment-model/helm-chart</i>
 *
 */
public interface HelmChart
    extends
    DataObject,
    Augmentable<HelmChart>,
    ExecutionEnvironmentModel
{


    public enum HelmVersion implements Enumeration {
        V2(0, "v2"),
        
        V3(1, "v3")
        ;
    
        private static final Map<String, HelmVersion> NAME_MAP;
        private static final Map<Integer, HelmVersion> VALUE_MAP;
    
        static {
            final Builder<String, HelmVersion> nb = ImmutableMap.builder();
            final Builder<Integer, HelmVersion> vb = ImmutableMap.builder();
            for (HelmVersion enumItem : HelmVersion.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private HelmVersion(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding HelmVersion item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<HelmVersion> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding HelmVersion item, or null if no such item exists
         */
        public static HelmVersion forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("helm-chart");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.HelmChart> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.HelmChart.class;
    }
    
    /**
     * Helm chart that models the execution environment, in any of the following ways:
     * - &amp;lt;helm-repo&amp;gt;/&amp;lt;helm-chart&amp;gt; - &amp;lt;helm-chart
     * folder name under helm-charts folder in the package&amp;gt; - &amp;lt;helm-chart
     * tgz file (w/ or w/o extension) under helm-charts folder in the package&amp;gt; -
     * &amp;lt;URL_where_to_fetch_chart&amp;gt; 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>helmChart</code>, or <code>null</code> if not present
     */
    @Nullable String getHelmChart();
    
    /**
     * Helm version to use for this helm-chart, v3 by default
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.HelmChart.HelmVersion</code> <code>helmVersion</code>, or <code>null</code> if not present
     */
    @Nullable HelmVersion getHelmVersion();

}

