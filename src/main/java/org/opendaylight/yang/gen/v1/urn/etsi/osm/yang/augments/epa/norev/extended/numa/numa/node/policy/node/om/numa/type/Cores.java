package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.om.numa.type;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.OmNumaType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * case cores {
 *   leaf num-cores {
 *     type uint8;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-numa/numa-node-policy/node/om-numa-type/cores</i>
 *
 */
public interface Cores
    extends
    DataObject,
    Augmentable<Cores>,
    OmNumaType
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cores");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.om.numa.type.Cores> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.om.numa.type.Cores.class;
    }
    
    /**
     * @return <code>org.opendaylight.yangtools.yang.common.Uint8</code> <code>numCores</code>, or <code>null</code> if not present
     */
    @Nullable Uint8 getNumCores();

}

