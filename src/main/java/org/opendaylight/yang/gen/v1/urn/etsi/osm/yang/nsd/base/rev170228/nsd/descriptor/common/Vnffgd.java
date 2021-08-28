package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.ClassifierKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.RspKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VNF Forwarding Graph Descriptors (VNFFGD).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list vnffgd {
 *   key id;
 *   uses fgd-common;
 *   list rsp {
 *     key id;
 *     uses rsp-common;
 *     list vnfd-connection-point-ref {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type leafref {
 *           path ../../../../constituent-vnfd/member-vnf-index;
 *         }
 *       }
 *       leaf order {
 *         type uint8;
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *       leaf vnfd-ingress-connection-point-ref {
 *         type string;
 *       }
 *       leaf vnfd-egress-connection-point-ref {
 *         type string;
 *       }
 *     }
 *   }
 *   list classifier {
 *     key id;
 *     uses classifier-common;
 *     leaf member-vnf-index-ref {
 *       type leafref {
 *         path ../../../constituent-vnfd/member-vnf-index;
 *       }
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *       }
 *     }
 *     leaf vnfd-connection-point-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd</i>
 * 
 * <p>To create instances of this class use {@link VnffgdBuilder}.
 * @see VnffgdBuilder
 * @see VnffgdKey
 *
 */
public interface Vnffgd
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<Vnffgd>,
    FgdCommon,
    Identifiable<VnffgdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.Vnffgd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.Vnffgd.class;
    }
    
    /**
     * List of Rendered Service Paths (RSP).
     *
     *
     *
     * @return <code>java.util.Map</code> <code>rsp</code>, or <code>null</code> if not present
     */
    @Nullable Map<RspKey, Rsp> getRsp();
    
    /**
     * @return <code>java.util.Map</code> <code>rsp</code>, or an empty list if it is not present
     */
    default @NonNull Map<RspKey, Rsp> nonnullRsp() {
        return CodeHelpers.nonnull(getRsp());
    }
    
    /**
     * List of classifier rules.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>classifier</code>, or <code>null</code> if not present
     */
    @Nullable Map<ClassifierKey, Classifier> getClassifier();
    
    /**
     * @return <code>java.util.Map</code> <code>classifier</code>, or an empty list if it is not present
     */
    default @NonNull Map<ClassifierKey, Classifier> nonnullClassifier() {
        return CodeHelpers.nonnull(getClassifier());
    }
    
    @Override
    VnffgdKey key();

}

