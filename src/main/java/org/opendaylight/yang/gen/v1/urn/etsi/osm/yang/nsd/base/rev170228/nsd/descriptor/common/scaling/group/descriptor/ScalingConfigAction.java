package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ScalingTrigger;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of scaling config actions
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-config-action {
 *   key trigger;
 *   leaf trigger {
 *     type manotypes:scaling-trigger;
 *   }
 *   leaf ns-config-primitive-name-ref {
 *     type leafref {
 *       path ../../../ns-configuration/config-primitive/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/scaling-config-action</i>
 * 
 * <p>To create instances of this class use {@link ScalingConfigActionBuilder}.
 * @see ScalingConfigActionBuilder
 * @see ScalingConfigActionKey
 *
 */
public interface ScalingConfigAction
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<ScalingConfigAction>,
    Identifiable<ScalingConfigActionKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-config-action");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction.class;
    }
    
    /**
     * scaling trigger
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ScalingTrigger</code> <code>trigger</code>, or <code>null</code> if not present
     */
    @Nullable ScalingTrigger getTrigger();
    
    /**
     * Reference to the NS primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsConfigPrimitiveNameRef</code>, or <code>null</code> if not present
     */
    @Nullable String getNsConfigPrimitiveNameRef();
    
    @Override
    ScalingConfigActionKey key();

}

