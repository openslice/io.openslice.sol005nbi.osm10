package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.configurable.properties.AdditionalConfigurableProperty;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.configurable.properties.AdditionalConfigurablePropertyKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes the configurable properties of the VNF (e.g. related to auto scaling 
 * and auto healing).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container configurable-properties {
 *   leaf is-auto-scalable-enabled {
 *     type boolean;
 *   }
 *   leaf is-auto-heal-enabled {
 *     type boolean;
 *   }
 *   list additional-configurable-property {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/configurable-properties</i>
 * 
 * <p>To create instances of this class use {@link ConfigurablePropertiesBuilder}.
 * @see ConfigurablePropertiesBuilder
 *
 */
public interface ConfigurableProperties
    extends
    ChildOf<Vnfd>,
    Augmentable<ConfigurableProperties>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("configurable-properties");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ConfigurableProperties> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ConfigurableProperties.class;
    }
    
    /**
     * It permits to enable (TRUE) / disable (FALSE) the auto-scaling functionality.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isAutoScalableEnabled</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isIsAutoScalableEnabled();
    
    /**
     * It permits to enable (TRUE) / disable (FALSE) the auto-healing functionality.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isAutoHealEnabled</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isIsAutoHealEnabled();
    
    /**
     * It provides VNF specific configurable properties that can be modified using the
     * ModifyVnfConfiguration operation.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>additionalConfigurableProperty</code>, or <code>null</code> if not present
     */
    @Nullable Map<AdditionalConfigurablePropertyKey, AdditionalConfigurableProperty> getAdditionalConfigurableProperty();
    
    /**
     * @return <code>java.util.Map</code> <code>additionalConfigurableProperty</code>, or an empty list if it is not present
     */
    default @NonNull Map<AdditionalConfigurablePropertyKey, AdditionalConfigurableProperty> nonnullAdditionalConfigurableProperty() {
        return CodeHelpers.nonnull(getAdditionalConfigurableProperty());
    }

}

