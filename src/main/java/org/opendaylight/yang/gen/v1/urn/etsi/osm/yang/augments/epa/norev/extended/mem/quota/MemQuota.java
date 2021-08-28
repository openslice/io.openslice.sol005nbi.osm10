package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.mem.quota;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.AllocationProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMemQuota;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Memory quota describes the memory resource allocation policy. Limit and Reserve 
 * values are defined in MB
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * container mem-quota {
 *   uses allocation-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-mem-quota/mem-quota</i>
 * 
 * <p>To create instances of this class use {@link MemQuotaBuilder}.
 * @see MemQuotaBuilder
 *
 */
public interface MemQuota
    extends
    ChildOf<ExtendedMemQuota>,
    Augmentable<MemQuota>,
    AllocationProperties
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("mem-quota");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.mem.quota.MemQuota> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.mem.quota.MemQuota.class;
    }

}

