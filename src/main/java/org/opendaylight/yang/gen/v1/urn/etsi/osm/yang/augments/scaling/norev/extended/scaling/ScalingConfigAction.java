package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ScalingTrigger;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.ExtendedScaling;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of scaling config actions
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>scaling</b>
 * <pre>
 * list scaling-config-action {
 *   key trigger;
 *   leaf trigger {
 *     type common:scaling-trigger;
 *   }
 *   leaf vnf-config-primitive-name-ref {
 *     type leafref {
 *       path /vnfd:vnfd/vnfd:df/vnfd:lcm-operations-configuration/vnfd:operate-vnf-op-config/day1-2:day1-2/day1-2:config-primitive/day1-2:name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>scaling/extended-scaling/scaling-config-action</i>
 * 
 * <p>To create instances of this class use {@link ScalingConfigActionBuilder}.
 * @see ScalingConfigActionBuilder
 * @see ScalingConfigActionKey
 *
 */
public interface ScalingConfigAction
    extends
    ChildOf<ExtendedScaling>,
    Augmentable<ScalingConfigAction>,
    Identifiable<ScalingConfigActionKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-config-action");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.ScalingConfigAction> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.ScalingConfigAction.class;
    }
    
    /**
     * scaling trigger
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ScalingTrigger</code> <code>trigger</code>, or <code>null</code> if not present
     */
    @Nullable ScalingTrigger getTrigger();
    
    /**
     * Reference to the VNF config primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfConfigPrimitiveNameRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfConfigPrimitiveNameRef();
    
    @Override
    ScalingConfigActionKey key();

}

