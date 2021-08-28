package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Mapping from mano-placement groups construct from NSD to cloud platform 
 * placement group construct
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list nsd-placement-group-maps {
 *   key placement-group-ref;
 *   leaf placement-group-ref {
 *     type string;
 *   }
 *   uses manotypes:placement-group-input;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/nsd-placement-group-maps</i>
 * 
 * <p>To create instances of this class use {@link NsdPlacementGroupMapsBuilder}.
 * @see NsdPlacementGroupMapsBuilder
 * @see NsdPlacementGroupMapsKey
 *
 */
public interface NsdPlacementGroupMaps
    extends
    ChildOf<NsInstanceConfigParamsCommon>,
    Augmentable<NsdPlacementGroupMaps>,
    PlacementGroupInput,
    Identifiable<NsdPlacementGroupMapsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-placement-group-maps");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps.class;
    }
    
    /**
     * Reference for NSD placement group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>placementGroupRef</code>, or <code>null</code> if not present
     */
    @Nullable String getPlacementGroupRef();
    
    @Override
    NsdPlacementGroupMapsKey key();

}

