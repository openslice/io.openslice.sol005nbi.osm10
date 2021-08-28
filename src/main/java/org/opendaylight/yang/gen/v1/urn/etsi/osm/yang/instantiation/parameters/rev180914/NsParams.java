package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.Vld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.VldKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.Vnf;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.VnfKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping ns_params {
 *   leaf vimAccountId {
 *     type string;
 *   }
 *   leaf ssh_keys {
 *     type string;
 *   }
 *   list vnf {
 *     key member-vnf-index;
 *     uses vnf_params;
 *   }
 *   list vld {
 *     key name;
 *     uses vld_params;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ns_params</i>
 *
 */
public interface NsParams
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns_params");

    @Override
    Class<? extends NsParams> implementedInterface();
    
    /**
     * @return <code>java.lang.String</code> <code>vimAccountId</code>, or <code>null</code> if not present
     */
    @Nullable String getVimAccountId();
    
    /**
     * @return <code>java.lang.String</code> <code>sshKeys</code>, or <code>null</code> if not present
     */
    @Nullable String getSshKeys();
    
    /**
     * @return <code>java.util.Map</code> <code>vnf</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfKey, Vnf> getVnf();
    
    /**
     * @return <code>java.util.Map</code> <code>vnf</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfKey, Vnf> nonnullVnf() {
        return CodeHelpers.nonnull(getVnf());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>vld</code>, or <code>null</code> if not present
     */
    @Nullable Map<VldKey, Vld> getVld();
    
    /**
     * @return <code>java.util.Map</code> <code>vld</code>, or an empty list if it is not present
     */
    default @NonNull Map<VldKey, Vld> nonnullVld() {
        return CodeHelpers.nonnull(getVld());
    }

}

