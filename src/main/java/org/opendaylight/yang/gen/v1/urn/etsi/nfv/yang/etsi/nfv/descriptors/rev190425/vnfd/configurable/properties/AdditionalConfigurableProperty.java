package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.configurable.properties;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ConfigurableProperties;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * It provides VNF specific configurable properties that can be modified using the 
 * ModifyVnfConfiguration operation.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list additional-configurable-property {
 *   key key;
 *   leaf key {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/configurable-properties/additional-configurable-property</i>
 * 
 * <p>To create instances of this class use {@link AdditionalConfigurablePropertyBuilder}.
 * @see AdditionalConfigurablePropertyBuilder
 * @see AdditionalConfigurablePropertyKey
 *
 */
public interface AdditionalConfigurableProperty
    extends
    ChildOf<ConfigurableProperties>,
    Augmentable<AdditionalConfigurableProperty>,
    Identifiable<AdditionalConfigurablePropertyKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("additional-configurable-property");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.configurable.properties.AdditionalConfigurableProperty> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.configurable.properties.AdditionalConfigurableProperty.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>key</code>, or <code>null</code> if not present
     */
    @Nullable String getKey();
    
    /**
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable String getValue();
    
    @Override
    AdditionalConfigurablePropertyKey key();

}

