package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMaps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMapsKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping ns-instance-config-params {
 *   uses ns-instance-config-params-common;
 *   list vnfd-placement-group-maps {
 *     key "placement-group-ref vnfd-id-ref";
 *     leaf vnfd-id-ref {
 *       type yang:uuid;
 *     }
 *     leaf placement-group-ref {
 *       type leafref {
 *         path "../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:placement-groups/project-vnfd:name";
 *       }
 *     }
 *     uses manotypes:placement-group-input;
 *   }
 *   uses cloud-config;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params</i>
 *
 */
public interface NsInstanceConfigParams
    extends
    DataObject,
    NsInstanceConfigParamsCommon,
    CloudConfig
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns-instance-config-params");

    @Override
    Class<? extends NsInstanceConfigParams> implementedInterface();
    
    /**
     * Mapping from mano-placement groups construct from VNFD to cloud platform
     * placement group construct
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfdPlacementGroupMaps</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfdPlacementGroupMaps</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> nonnullVnfdPlacementGroupMaps() {
        return CodeHelpers.nonnull(getVnfdPlacementGroupMaps());
    }

}

