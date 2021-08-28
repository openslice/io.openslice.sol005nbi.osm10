package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.vif.quota.VifQuota;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * grouping extended-vif-quota {
 *   container vif-quota {
 *     uses allocation-properties;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-vif-quota</i>
 *
 */
public interface ExtendedVifQuota
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-vif-quota");

    @Override
    Class<? extends ExtendedVifQuota> implementedInterface();
    
    /**
     * Virtual interfaces quota describes the virtual interface bandwidth resource
     * allocation policy. Limit and Reserve values are defined in Mbps
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.vif.quota.VifQuota</code> <code>vifQuota</code>, or <code>null</code> if not present
     */
    @Nullable VifQuota getVifQuota();

}

