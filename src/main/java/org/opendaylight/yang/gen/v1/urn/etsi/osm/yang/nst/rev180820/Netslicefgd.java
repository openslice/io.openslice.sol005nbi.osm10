package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.Classifier;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.ClassifierKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.Rsp;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.RspKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping netslicefgd {
 *   uses nsd-base:fgd-common;
 *   list rsp {
 *     key id;
 *     uses rsp;
 *   }
 *   list classifier {
 *     key id;
 *     uses classifier;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/netslicefgd</i>
 *
 */
public interface Netslicefgd
    extends
    DataObject,
    FgdCommon
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslicefgd");

    @Override
    Class<? extends Netslicefgd> implementedInterface();
    
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

}

